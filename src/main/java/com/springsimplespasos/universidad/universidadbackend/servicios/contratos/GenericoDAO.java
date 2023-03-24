package com.springsimplespasos.universidad.universidadbackend.servicios.contratos;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;

import java.util.Optional;

public interface GenericoDAO <E> {

    Optional<E> findById(Integer id); // optional allow know, this objet has data or not, recomend used
    E save(E entidad);
    Iterable<E> findAll();
    void deleteById(Integer id);
}
