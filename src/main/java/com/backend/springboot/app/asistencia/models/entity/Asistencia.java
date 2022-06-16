package com.backend.springboot.app.asistencia.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ths_asistencia")
public class Asistencia {

    @Id
    @Column(name = "id_asistencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long asistenciaId;

    @Column(name = "fe_asistencia")
    private Date fechaAsist;

    @Column(name = "im_asistencia")
    private String imagenAsist;

    @Column(name = "de_pregunta")
    private String pregunta;

    @Column(name = "de_respuesta")
    private String respuesta;




}
