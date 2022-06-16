package com.backend.springboot.app.asistencia.controllers;

import com.backend.springboot.app.asistencia.models.entity.Asistencia;
import com.backend.springboot.app.asistencia.models.services.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/asistencia")
public class AsistenciaController {
    @Autowired
    private AsistenciaService asistenciaService;
    @GetMapping("/listar")
    public List<Asistencia> listar() {

        return asistenciaService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Asistencia detalle(@PathVariable Long id) {
        return asistenciaService.findById(id);
    }
}
