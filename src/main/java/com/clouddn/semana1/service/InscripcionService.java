package com.clouddn.semana1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clouddn.semana1.model.Curso;
import com.clouddn.semana1.model.Inscripcion;
import com.clouddn.semana1.repository.CursoRepository;
import com.clouddn.semana1.repository.InscripcionRepository;

@Service
public class InscripcionService {

    @Autowired
    private InscripcionRepository repoInscripcion;

    @Autowired
    private CursoRepository repoCurso;

    //Seleccionar cursos y devolver resumen
    public Inscripcion procesarInscripcion(List<Long> listaId) { //Lista de ids para seleccionar cursos a inscribir
        List<Curso> listaInscritos = repoCurso.findAllById(listaId);

        Long costoTotal = listaInscritos.stream().mapToLong(Curso::getCostoInscripcion).sum();

        Inscripcion insc = new Inscripcion();
        insc.setCursos(listaInscritos);
        insc.setCostoTotal(costoTotal);

        return repoInscripcion.save(insc);
    }
    
}
