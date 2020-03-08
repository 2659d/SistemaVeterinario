package com.svi.clinicaveterinaria.model.services;



public interface ClienteService {
	public List<informacion> findAll();
	
	
	public informacion save( entity);
	public Optional<informacion> findById(Long id);
	public void delete(Long id);
	
	
}
