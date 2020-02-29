package com.svi.clinicaveterinaria.model.entidad;

import java.io.Serializable;

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
@Table(name="informacion")

public class informacion  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idInformacion;
	
	@Column(name="infoNombre")
	@NotEmpty
	private String nombreCompleto;
	
	@Column(name="infoApellido")
	@NotEmpty
	private String apellidoCompleto;
	
	@Column(name="infoDireccion")
	@NotEmpty
	private String infoDireccion;
	
	@Column(name="infoDui")
	private int informacionDui;
	
	@Column(name="infoCorreo")
	@NotEmpty
	private String informacionCorreo;
	
	@Column(name="infoPassword")
	@NotEmpty
	private String Password;
	
			
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRol", nullable=false)
	private Rol Rol;	
	
}
