package com.university.JPAspringboot.repository;

import com.university.JPAspringboot.model.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
}
