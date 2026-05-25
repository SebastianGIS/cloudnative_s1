package com.clouddn.semana1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clouddn.semana1.model.Inscripcion;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {

}
