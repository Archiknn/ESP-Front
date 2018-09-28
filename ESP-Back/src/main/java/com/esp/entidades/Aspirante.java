package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aspirante {
	
	@Id
	@GeneratedValue
	
	@Column(name = "primer_apellido")
	private String primerApellido;
	@Column(name = "segundo_apellido")
	private String segundoNombre;
	@Column(name = "primer_nombre")
	private String primerNombre;
	
}
