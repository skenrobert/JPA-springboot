package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("repositorioAlumnos") //generate custom bean
public interface AlumnoRepository extends PersonaRepository {

    @Query("select a from Alumno a join fetch a.carrera c where c.nombre = ?1")  //la carga peresosa o fetch = FetchType.LAZY, causa cambio en esta consulta sql agregando el join fetch
    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);

}
