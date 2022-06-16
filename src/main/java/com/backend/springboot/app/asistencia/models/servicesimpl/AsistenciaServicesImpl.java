package com.backend.springboot.app.asistencia.models.servicesimpl;

import com.backend.springboot.app.asistencia.models.entity.Asistencia;
import com.backend.springboot.app.asistencia.models.repository.AsistenciaRepository;
import com.backend.springboot.app.asistencia.models.services.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AsistenciaServicesImpl implements AsistenciaService {
    @Autowired
    private AsistenciaRepository asistenciaRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Asistencia> findAll() {

        return (List<Asistencia>)  asistenciaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Asistencia findById(Long id) {
        return asistenciaRepository.findById(id).orElse(null);
    }
}
