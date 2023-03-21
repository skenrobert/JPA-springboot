package com.university.JPAspringboot.services.implementations;

import com.university.JPAspringboot.model.entity.Persona;
import com.university.JPAspringboot.repository.PersonaRepository;
import com.university.JPAspringboot.services.contract.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoDAOImpl implements AlumnoDAO {

   // @Autowired
    @Qualifier("repositorioAlumnos")
    private PersonaRepository repository;
    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Void deleteById(Integer id) {
        repository.deleteById(id);
        return null;
    }
}
