package com.clouddn.semana1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clouddn.semana1.model.Curso;
import com.clouddn.semana1.service.CursoService;

@RestController
@RequestMapping("/api")
public class CursoController {

    @Autowired
    private CursoService service;

    //get cursos
    @GetMapping("/cursos")
    public ResponseEntity<List<Curso>> obtenerListaCursos() {
        return ResponseEntity.ok(service.getAllCursos());
    }


    //post cursos
    @PostMapping("/cursos")
    public ResponseEntity<Curso> agregarCurso(Curso curso) {
        return ResponseEntity.ok(service.crearCurso(curso));
    }

}
