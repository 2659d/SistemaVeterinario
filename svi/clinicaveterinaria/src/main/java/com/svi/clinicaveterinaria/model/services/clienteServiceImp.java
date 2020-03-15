package com.svi.clinicaveterinaria.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svi.clinicaveterinaria.model.dao.clienterepository;
import com.svi.clinicaveterinaria.model.entidad.Rol;

@Service
public class clienteServiceImp implements ClienteService {
	
	@Autowired
	clienterepository repository; 
	

	@Override
	public List<Rol> findAll() {
		return repository.findAll();
		
	}

}
