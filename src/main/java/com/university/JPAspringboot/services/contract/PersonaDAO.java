package com.university.JPAspringboot.services.contract;

import com.university.JPAspringboot.model.entity.Persona;

import java.util.Optional;

public interface PersonaDAO {
    Optional<Persona> findById(Integer id);
    Persona save(Persona persona);
    Iterable<Persona> findAll();
    Void deleteById(Integer id);
}
