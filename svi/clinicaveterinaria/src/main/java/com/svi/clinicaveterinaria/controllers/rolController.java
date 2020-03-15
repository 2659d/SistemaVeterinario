package com.svi.clinicaveterinaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.svi.clinicaveterinaria.model.entidad.Rol;
import com.svi.clinicaveterinaria.model.services.rolService;


@RestController
@RequestMapping("/roles")
public class rolController {

	
	@Autowired
	private rolService ClienteService; 
	
	
	@RequestMapping(value="/rol1", method = RequestMethod.GET)
	public Iterable<Rol> obtenerListas(){
		Iterable<Rol> nombreObjeto = ClienteService.GetAllrolNombre();
		return nombreObjeto;
	}
	
}




