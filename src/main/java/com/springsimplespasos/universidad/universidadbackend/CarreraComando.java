package com.springsimplespasos.universidad.universidadbackend;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarreraComando implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
 /*       Carrera ingSistemas = new Carrera(null, "ingenieria", 50, 5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());*/

//        Carrera carrera = null;
//        Optional<Carrera> oCarrera = servicio.findById(1);
//        if (oCarrera.isPresent()){
//          carrera = oCarrera.get();
//            System.out.println(carrera.toString());
//        }else{
//            System.out.println("Carrera No Encontrada");
//        }
//
//        carrera.setCantidadAnios(6);
//        carrera.setCantidaMaterias(65);
//
//        servicio.save(carrera);
//        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());
//
//        servicio.deleteById(1);
//        System.out.println(servicio.findById(1).orElse(new Carrera()).toString());

        //*********************************************************************

  /*      Carrera ingSistemas = new Carrera(null, "Sistemas ingenieria", 50, 5);
        Carrera ingElectrica = new Carrera(null, "Electrica ingenieria", 50, 5);
        Carrera ingCivil = new Carrera(null, "Civil ingenieria", 50, 5);
        Carrera ingMecanica = new Carrera(null, "Mecanica INGENIERIA", 50, 5);

        servicio.save(ingSistemas);
        servicio.save(ingElectrica);
        servicio.save(ingCivil);
        servicio.save(ingMecanica);
*/

        //*******************************************************************

/*        List<Carrera> carreras = (List<Carrera>)servicio.findCarrerasByNombreContains("ingenieria");
        carreras.forEach(System.out::println);*/

/*        List<Carrera> carrerasIgnoreCase = (List<Carrera>)servicio.findCarrerasByNombreContainsIgnoreCase("ingenieria");
        List<Carrera> carrerasIgnoreCase1 = (List<Carrera>)servicio.findCarrerasByNombreContainsIgnoreCase("INGENIERIA");
        carrerasIgnoreCase.forEach(System.out::println);
        carrerasIgnoreCase1.forEach(System.out::println);*/

        /*List<Carrera> carrerasAnio = (List<Carrera>)servicio.findCarrerasByCantidadAniosAfter(4);
        carrerasAnio.forEach(System.out::println);*/
    }
}
