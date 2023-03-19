package com.university.JPAspringboot.services.contract;

import com.university.JPAspringboot.model.entity.Carrera;

import java.util.Optional;

public interface CarreraDAO {

    Optional<Carrera> findById(Integer id);
    Carrera save(Carrera carrera);
    Iterable<Carrera> findAll();
    Void deleteById(Integer id);
}
