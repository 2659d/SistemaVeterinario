package com.svi.clinicaveterinaria.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.svi.clinicaveterinaria.model.entidad.raza;

@Repository
public interface razaRepository extends CrudRepository<raza, Long> {

}
