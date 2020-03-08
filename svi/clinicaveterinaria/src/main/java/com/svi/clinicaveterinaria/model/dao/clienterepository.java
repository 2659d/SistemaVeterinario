package com.svi.clinicaveterinaria.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.svi.clinicaveterinaria.model.entidad.informacion;

public interface clienterepository extends CrudRepository<informacion, String> {

}
