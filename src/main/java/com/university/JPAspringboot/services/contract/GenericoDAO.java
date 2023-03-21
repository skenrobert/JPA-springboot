package com.university.JPAspringboot.services.contract;

import java.util.Optional;

public interface GenericoDAO<E> {

    Optional<E> findById(Integer id);
    E save(E entidad);
    Iterable<E> findAll();
    Void deleteById(Integer id);
}
