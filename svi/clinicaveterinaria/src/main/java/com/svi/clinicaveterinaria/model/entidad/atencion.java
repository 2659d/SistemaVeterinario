package com.svi.clinicaveterinaria.model.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity 
@Table(name="atencion")
public class atencion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idAtencion; 

	@Column(name="servicio")
	private String servicio;
	
	@Column(name="fecha_atencion")
	@NotEmpty
	private Date fechaAtencion;
	
	@Column(name="precio")
	@NotEmpty
	private int costos;
	
	
	@Column(name="detalles")	
	private String detalles;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_mascota", nullable=false)
	private mascota mascota;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idInformacion", nullable=false)
	private informacion informacion;
	
	

}
