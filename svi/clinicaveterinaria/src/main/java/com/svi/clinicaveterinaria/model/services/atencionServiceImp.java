package com.svi.clinicaveterinaria.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svi.clinicaveterinaria.model.dao.atencionRepository;

import com.svi.clinicaveterinaria.model.entidad.atencion;

@Service

public class atencionServiceImp implements atencionService {

	@Autowired
    public  atencionRepository repository;

	@Override
	public List<atencion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
}
