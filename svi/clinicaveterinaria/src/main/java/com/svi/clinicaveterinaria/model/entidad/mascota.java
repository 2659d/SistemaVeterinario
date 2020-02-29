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
@Table(name="mascota")
public class mascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id_mascota;
	
	@Column(name="nom_Mascota")
	@NotEmpty
	private String nombreMascota;
	
	@Column(name="peso")
	@NotEmpty
	private Short peso;
	
	@Column(name="Fecha_nacimiento")
	@NotEmpty
	private Date fechaNacimiento;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_raza", nullable=false)
	private raza raza;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idInformacion", nullable=false)
	private informacion informacion;
	
	
}
