package com.backend.springboot.app.asistencia.models.repository;

import com.backend.springboot.app.asistencia.models.entity.Asistencia;
import org.springframework.data.repository.CrudRepository;

public interface AsistenciaRepository extends CrudRepository<Asistencia,Long> {

}
