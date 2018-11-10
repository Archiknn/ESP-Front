package com.esp.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libreta_militar", schema = "ESP")
public class LibretaMilitar {

	@Id
	@GeneratedValue

	@Column(name = "numero")
	private int numero;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "clase")
	private String clase;
	@Column(name = "distrito")
	private int distrito;
	@Column(name = "fecha_expedicion")
	private Date fechaExpedicion;

	public LibretaMilitar() {
	}

	public LibretaMilitar(int numero, String numeroDocumentoAspirante, String clase, int distrito,
			Date fechaExpedicion) {
		super();
		this.numero = numero;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.clase = clase;
		this.distrito = distrito;
		this.fechaExpedicion = fechaExpedicion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNumeroDocumentoAspirante() {
		return numeroDocumentoAspirante;
	}

	public void setNumeroDocumentoAspirante(String numeroDocumentoAspirante) {
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getDistrito() {
		return distrito;
	}

	public void setDistrito(int distrito) {
		this.distrito = distrito;
	}

	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
}


