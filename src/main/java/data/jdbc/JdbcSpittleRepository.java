package data.jdbc;

import data.SpittleRepository;
import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.List;

/**
 * Created by anton on 12.07.17.
 */
@Repository
public class JdbcSpittleRepository implements SpittleRepository {
    public List<Spittle> findRecentSpittles() {
        return null;
    }

    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    public Spittle findOne(long id) {
        return null;
    }

    public void save(Spittle spittle) {

    }
}
