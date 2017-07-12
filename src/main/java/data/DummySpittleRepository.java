package data;

import spittr.Spittle;

import java.util.List;

/**
 * Created by anton on 11.07.17.
 */
public class DummySpittleRepository implements SpittleRepository {
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
