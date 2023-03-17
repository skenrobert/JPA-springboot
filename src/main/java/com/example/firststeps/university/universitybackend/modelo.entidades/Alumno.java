package com.example.firststeps.university.universitybackend.modelo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno extends Persona {

    @ManyToOne(
            optional = true,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;
    public Alumno() {
    }

    public Alumno(Integer id, String nombre, String apellido, String cedula, Direccion direccion) {
        super(id, nombre, apellido, cedula, direccion);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Alumno{" +
                "carrera=" + carrera +
                '}';
    }
}
