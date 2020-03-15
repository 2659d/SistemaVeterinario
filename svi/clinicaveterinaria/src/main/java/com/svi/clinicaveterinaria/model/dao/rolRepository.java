package com.svi.clinicaveterinaria.model.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.svi.clinicaveterinaria.model.entidad.Rol;



@Repository
public interface rolRepository extends CrudRepository<Rol, Long> {
	
	public Set<Rol> findByrolNombre(String rolNombre);
	
	
	}
