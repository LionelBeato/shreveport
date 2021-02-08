package com.tts.helloworld.DAO;

import java.util.List;
import java.util.Optional;


// below is your dao or Data Access Object
// this is the interface where we define the methods for the dao
// it will serve as an abstraction layer above our persistence layer
public interface Dao<T> {

    Optional<T> get(long id);
    List<T> getAll();

//    void save(T t);

}
