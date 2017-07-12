package data.jdbc;

import data.SpitterRepository;
import data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spittr.Spitter;
import spittr.Spittle;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by anton on 12.07.17.
 */
@Repository
public class JdbcSpitterRepository implements SpitterRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String INSERT_SPITTER = "insert into Spitter (username, password, first_name, last_name, email) values (?, ?, ?, ?, ?)";

    public Spitter save(Spitter spitter) {
        jdbcTemplate.update(INSERT_SPITTER,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFirstName(),
                spitter.getLastName(),
                spitter.getEmail());
        return spitter;
    }

    public Spitter findByUsername(String username) {
        return jdbcTemplate.queryForObject("select id, username, password, first_name, last_name, email from spitter where username=?",
                new SpitterRowMaper(),
                username);
        //return new Spitter("alexey","123456","Alexey",jdbcTemplate.getClass().getName(),"alex@gmail.com");
    }

    private static final class SpitterRowMaper implements RowMapper<Spitter> {


        public Spitter mapRow(ResultSet resultSet, int i) throws SQLException {
            long id = resultSet.getLong("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            return new Spitter(id, username, password, firstName, lastName, email);
        }
    }
}
