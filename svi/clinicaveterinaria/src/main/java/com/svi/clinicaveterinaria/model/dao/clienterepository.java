package com.svi.clinicaveterinaria.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.svi.clinicaveterinaria.model.entidad.informacion;

@Repository
public interface clienterepository extends CrudRepository<informacion, String> {
 
}
