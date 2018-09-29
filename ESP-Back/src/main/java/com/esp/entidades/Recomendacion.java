package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "recomendacion", schema = "ESP")
public class Recomendacion {
	
	@Id
	@GeneratedValue
	
	@Column(name = "numero_documento")
	private String numeroDocumento;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "grado")
	private String grado;
	@Column(name = "primer_apellido")
	private String primerApellido;
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	@Column(name = "primer_nombre")
	private String primerNombre;
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	@Column(name = "fuerza")
	private String fuerza;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "unidad")
	private String unidad;
	
	
	public Recomendacion() {
		
	}


	public Recomendacion(String numeroDocumento, String numeroDocumentoAspirante, String grado, String primerApellido,
			String segundoApellido, String primerNombre, String segundoNombre, String fuerza, String cargo,
			String unidad) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.grado = grado;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.fuerza = fuerza;
		this.cargo = cargo;
		this.unidad = unidad;
	}


	public String getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public String getNumeroDocumentoAspirante() {
		return numeroDocumentoAspirante;
	}


	public void setNumeroDocumentoAspirante(String numeroDocumentoAspirante) {
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
	}


	public String getGrado() {
		return grado;
	}


	public void setGrado(String grado) {
		this.grado = grado;
	}


	public String getPrimerApellido() {
		return primerApellido;
	}


	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}


	public String getSegundoApellido() {
		return segundoApellido;
	}


	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}


	public String getPrimerNombre() {
		return primerNombre;
	}


	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}


	public String getSegundoNombre() {
		return segundoNombre;
	}


	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}


	public String getFuerza() {
		return fuerza;
	}


	public void setFuerza(String fuerza) {
		this.fuerza = fuerza;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
}