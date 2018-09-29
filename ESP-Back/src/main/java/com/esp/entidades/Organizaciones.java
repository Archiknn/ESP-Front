package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "organizaciones", schema = "ESP")
public class Organizaciones {
	
	@Id
	@GeneratedValue

	@Column(name = "id_organizacion")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "calidad_miembro")
	private String calidadMiembro;
	
	
	public Organizaciones() {
		
	}


	public Organizaciones(String id, String numeroDocumentoAspirante, String nombre, String calidadMiembro) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.nombre = nombre;
		this.calidadMiembro = calidadMiembro;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNumeroDocumentoAspirante() {
		return numeroDocumentoAspirante;
	}
	public void setNumeroDocumentoAspirante(String numeroDocumentoAspirante) {
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalidadMiembro() {
		return calidadMiembro;
	}
	public void setCalidadMiembro(String calidadMiembro) {
		this.calidadMiembro = calidadMiembro;
	}
}