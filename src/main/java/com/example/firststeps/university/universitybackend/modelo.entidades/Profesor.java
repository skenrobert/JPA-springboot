package com.example.firststeps.university.universitybackend.modelo.entidades;

import java.math.BigDecimal;

public class Profesor extends Persona{

    private BigDecimal sueldo;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String cedula, Direccion direccion, BigDecimal sueldo) {
        super(id, nombre, apellido, cedula, direccion);
        this.sueldo = sueldo;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }
}
