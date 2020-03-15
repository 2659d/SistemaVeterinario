package com.svi.clinicaveterinaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.svi.clinicaveterinaria.model.entidad.Rol;
import com.svi.clinicaveterinaria.model.services.ClienteService;


@RestController
@RequestMapping("/clientes")
public class informacionController {

	@Autowired
	ClienteService ClienteService; 
	
	
	@RequestMapping(value="/credits-lines", method = RequestMethod.GET)
	public List<Rol> obtenerListas(){
		List<Rol> nombreObjeto = ClienteService.findAll();
		return nombreObjeto;
	}
	
}




