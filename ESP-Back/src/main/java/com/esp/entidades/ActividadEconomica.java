package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actividad_economica", schema = "ESP")
public class ActividadEconomica {

	@Id
	@GeneratedValue
	
	@Column(name = "id_actividad")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "empresa")
	private String empresa;
	@Column(name = "razon_social")
	private String razonSocial;
	@Column(name = "actividad_desarrollada")
	private String actividadDesarrollada;
	
	
	public ActividadEconomica() {
		
	}


	public ActividadEconomica(String id, String numeroDocumentoAspirante, String empresa, String razonSocial,
			String actividadDesarrollada) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.empresa = empresa;
		this.razonSocial = razonSocial;
		this.actividadDesarrollada = actividadDesarrollada;
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

	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getActividadDesarrollada() {
		return actividadDesarrollada;
	}
	public void setActividadDesarrollada(String actividadDesarrollada) {
		this.actividadDesarrollada = actividadDesarrollada;
	}
}
