package data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by anton on 11.07.17.
 */
public interface SpittleRepository {

    List<Spittle> findRecentSpittles();

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long id);

    void save(Spittle spittle);
}
