package com.svi.clinicaveterinaria.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.svi.clinicaveterinaria.model.entidad.Rol;



@Repository
public interface clienterepository extends CrudRepository<Rol, Long> {
	
	public List<Rol> findAll();
	
	}
