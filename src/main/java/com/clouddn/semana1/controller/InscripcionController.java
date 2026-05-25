package com.clouddn.semana1.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clouddn.semana1.model.Inscripcion;
import com.clouddn.semana1.service.InscripcionService;

@RestController
@RequestMapping("/api")
public class InscripcionController {

    private InscripcionService service;

    @PostMapping("/inscripcion")
    public ResponseEntity<Inscripcion> inscribirCurso(List<Long> listaId) {
        return ResponseEntity.ok(service.procesarInscripcion(listaId));
    }

}
