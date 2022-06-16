package com.backend.springboot.app.asistencia.models.services;

import com.backend.springboot.app.asistencia.models.entity.Asistencia;

import java.util.List;

public interface AsistenciaService {
    public List<Asistencia> findAll();

    public Asistencia findById(Long id);
}
