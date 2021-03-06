package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "progenitor", schema = "ESP")
public class Progenitor {
	
	@Id
	@GeneratedValue
	
	@Column(name = "numero_documento")
	private String numeroDocumento;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	@Column(name = "primer_apellido")
	private String primerApellido;
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	@Column(name = "primer_nombre")
	private String primerNombre;
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	@Column(name = "ocupacion")
	private String ocupacion;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "departamento_direccion")
	private String departamentoDireccion;
	@Column(name = "ciudad_direccion")
	private String ciudadDireccion;
	@Column(name = "numero_celular")
	private int numeroCelular;
	@Column(name = "numero_telefono")
	private int numeroTelefono;
	@Column(name = "vive")
	private boolean vive;
	@Column(name = "parentesco")
	private String parentesco;
	
	
	public Progenitor() {
		
	}


	public Progenitor(String numeroDocumento, String numeroDocumentoAspirante, String tipoDocumento,
			String primerApellido, String segundoApellido, String primerNombre, String segundoNombre, String ocupacion,
			String direccion, String departamentoDireccion, String ciudadDireccion, int numeroCelular,
			int numeroTelefono, boolean vive, String parentesco) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.tipoDocumento = tipoDocumento;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.ocupacion = ocupacion;
		this.direccion = direccion;
		this.departamentoDireccion = departamentoDireccion;
		this.ciudadDireccion = ciudadDireccion;
		this.numeroCelular = numeroCelular;
		this.numeroTelefono = numeroTelefono;
		this.vive = vive;
		this.parentesco = parentesco;
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


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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


	public String getOcupacion() {
		return ocupacion;
	}


	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getDepartamentoDireccion() {
		return departamentoDireccion;
	}


	public void setDepartamentoDireccion(String departamentoDireccion) {
		this.departamentoDireccion = departamentoDireccion;
	}


	public String getCiudadDireccion() {
		return ciudadDireccion;
	}


	public void setCiudadDireccion(String ciudadDireccion) {
		this.ciudadDireccion = ciudadDireccion;
	}


	public int getNumeroCelular() {
		return numeroCelular;
	}


	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}


	public int getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}


	public boolean isVive() {
		return vive;
	}


	public void setVive(boolean vive) {
		this.vive = vive;
	}


	public String getParentesco() {
		return parentesco;
	}


	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
}