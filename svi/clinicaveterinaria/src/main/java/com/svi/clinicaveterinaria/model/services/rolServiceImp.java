package com.svi.clinicaveterinaria.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svi.clinicaveterinaria.model.dao.rolRepository;
import com.svi.clinicaveterinaria.model.entidad.Rol;

@Service
public class rolServiceImp implements rolService {
	
	@Autowired
	private rolRepository repository;

	@Override
	public Iterable<Rol> GetAllrolNombre() {
		return repository.findAll();
	}

	@Override
	public Iterable<Rol> Getllusers() {
		// TODO Auto-generated method stub
		return null;
	} 
	
	
	
	}





