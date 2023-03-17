package com.example.firststeps.university.universitybackend.modelo.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Profesor extends Persona{

    private BigDecimal sueldo;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
        name = "profesor_carrera",
        joinColumns = @JoinColumn(name = "profesor_id"),
       inverseJoinColumns = @JoinColumn(name = "carrera_id")
    )
    private Set<Carrera> carreras;

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

    @Override
    public String toString() {
        return super.toString()+
                "\tProfesor{" +
                "sueldo=" + sueldo +
                '}';
    }
}
