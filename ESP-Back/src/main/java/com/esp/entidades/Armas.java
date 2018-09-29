package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "armas", schema = "ESP")
public class Armas {
		
	@Id
	@GeneratedValue
	
	@Column(name = "id_viaje")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "conoce")
	private boolean conoce;
	@Column(name = "cuales")
	private String cuales;
	@Column(name = "cuando")
	private String cuando;
	@Column(name = "compania")
	private String compania;
	
	
	public Armas() {
		
	}


	public Armas(String id, String numeroDocumentoAspirante, boolean conoce, String cuales, String cuando,
			String compania) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.conoce = conoce;
		this.cuales = cuales;
		this.cuando = cuando;
		this.compania = compania;
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

	public boolean isConoce() {
		return conoce;
	}
	public void setConoce(boolean conoce) {
		this.conoce = conoce;
	}

	public String getCuales() {
		return cuales;
	}
	public void setCuales(String cuales) {
		this.cuales = cuales;
	}

	public String getCuando() {
		return cuando;
	}
	public void setCuando(String cuando) {
		this.cuando = cuando;
	}

	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
}