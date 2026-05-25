package com.clouddn.semana1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clouddn.semana1.model.Curso;
import com.clouddn.semana1.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repo; 


    //Crear un curso (POST)
    public Curso crearCurso(Curso curso) {
        return repo.save(curso);
    }

    //Obtener todos los cursos (GET)
    public List<Curso> getAllCursos() {
        return repo.findAll();
    }

}
