package com.university.JPAspringboot.services.implementations;

import com.university.JPAspringboot.model.entity.Carrera;
import com.university.JPAspringboot.repository.CarreraRepository;
import com.university.JPAspringboot.services.contract.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO {

    //@Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }
}
