package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bienes_patrimoniales", schema = "ESP")
public class BienPatrimonial {
	
	@Id
	@GeneratedValue
	
	@Column(name = "identificacion")
	private String identificacion;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "pais")
	private String pais;
	@Column(name = "valor")
	private String valor;
	
	
	public BienPatrimonial() {
		
	}


	public BienPatrimonial(String identificacion, String numeroDocumentoAspirante, String tipo, String pais,
			String valor) {
		super();
		this.identificacion = identificacion;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.tipo = tipo;
		this.pais = pais;
		this.valor = valor;
	}


	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNumeroDocumentoAspirante() {
		return numeroDocumentoAspirante;
	}
	public void setNumeroDocumentoAspirante(String numeroDocumentoAspirante) {
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
}