package data;

import spittr.Spitter;

/**
 * Created by anton on 11.07.17.
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
