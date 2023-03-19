package com.university.JPAspringboot.services.implementations;

import com.university.JPAspringboot.model.entity.Carrera;
import com.university.JPAspringboot.repository.CarreraRepository;
import com.university.JPAspringboot.services.contract.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarreraDAOImpl implements CarreraDAO {

    @Autowired
    private CarreraRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Carrera> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Carrera save(Carrera carrera) {
        return repository.save(carrera);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Carrera> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Void deleteById(Integer id) {
        repository.deleteById(id);
        return null;
    }
}
