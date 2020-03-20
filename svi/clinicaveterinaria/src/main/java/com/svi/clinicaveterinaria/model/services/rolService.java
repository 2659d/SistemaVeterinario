package com.svi.clinicaveterinaria.model.services;

import java.util.List;

import com.svi.clinicaveterinaria.model.entidad.Rol;


public interface rolService {
	
	
	public Rol get(long id);
	public List<Rol> getAll();
	public void	Post(Rol rol);
	public void Put(Rol rol,long idRol);
	public List<Rol> findAll();
	public void delete(long idRol);
	
	
}
