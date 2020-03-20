package com.svi.clinicaveterinaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.svi.clinicaveterinaria.model.entidad.Rol;
import com.svi.clinicaveterinaria.model.entidad.atencion;
import com.svi.clinicaveterinaria.model.services.atencionService;



@RestController
@RequestMapping("/atencion")
public class atencionControlller {
	
	
	@Autowired
	public atencionService atencionService; 
	
	@RequestMapping(value="/atencion1", method = RequestMethod.GET)
	public List<atencion> listaAtencion(){
	List<atencion> Lista = atencionService.findAll();
	return Lista;
	}
	
	
	

}
