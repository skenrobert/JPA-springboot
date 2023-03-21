package com.university.JPAspringboot.repository;

import com.university.JPAspringboot.services.contract.CarreraDAO;
import com.university.JPAspringboot.services.implementations.CarreraDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarreraConfig {

    @Bean
    public CarreraDAO getCarreraUno(){
        //return new CarreraDAOImpl();
        return null;
    }
}
