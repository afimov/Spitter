package data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spittr.Spitter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 11.07.17.
 */
public class DummySpitterRepository implements SpitterRepository {

    Map<String, Spitter> db = new HashMap<String, Spitter>();

    public Spitter save(Spitter spitter) {
        db.put(spitter.getUsername(), spitter);
        return spitter;
    }

    public Spitter findByUsername(String username) {
        return db.get(username);
    }
}
