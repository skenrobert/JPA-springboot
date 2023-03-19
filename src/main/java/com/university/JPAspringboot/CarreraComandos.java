package com.university.JPAspringboot;

import com.university.JPAspringboot.model.entity.Carrera;
import com.university.JPAspringboot.services.contract.CarreraDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarreraComandos implements CommandLineRunner {

    private CarreraDAO servicio;
    @Override
    public void run(String... args) throws Exception {
        Carrera ingSistemas = new Carrera(null, "Ing Sistemas", 50 , 5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());
    }
}
