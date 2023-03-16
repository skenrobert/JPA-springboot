package com.example.firststeps.university.universitybackend.modelo.entidades;

public class Alumno extends Persona {

    public Alumno() {
    }

    public Alumno(Integer id, String nombre, String apellido, String cedula, Direccion direccion) {
        super(id, nombre, apellido, cedula, direccion);
    }
}
