package com.clouddn.semana1.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INSCRIPCION")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
    name = "INSCRIPCION_CURSOS  ", 
    joinColumns = @JoinColumn(name = "inscripcion_id"), 
    inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private List<Curso> Cursos;

    private Long costoTotal;

}
