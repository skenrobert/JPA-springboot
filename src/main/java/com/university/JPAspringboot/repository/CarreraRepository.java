package com.university.JPAspringboot.repository;

import com.university.JPAspringboot.model.entity.Carrera;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

public interface CarreraRepository extends CrudRepository<Carrera, Integer> {
}

