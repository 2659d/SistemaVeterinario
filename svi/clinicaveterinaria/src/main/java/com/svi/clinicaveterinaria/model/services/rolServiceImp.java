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
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> getAll() {
		return (List<Rol>) repository.findAll();
	}

	@Override
	public void Post(Rol rol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Put(Rol rol, long idRol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long idRol) {
		// TODO Auto-generated method stub
		
	}


	
	
	}
