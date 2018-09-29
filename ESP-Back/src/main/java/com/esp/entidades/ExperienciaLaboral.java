package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experiencia_laboral", schema = "ESP")
public class ExperienciaLaboral {

	@Id
	@GeneratedValue
	
	@Column(name = "id_experiencia")
	private int id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "empresa")
	private String empresa;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "departamento_direccion")
	private String departamentoDireccion;
	@Column(name = "ciudad_direccion")
	private String ciudadDireccion;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "tiempo_meses")
	private int tiempoMeses;
	@Column(name = "numero_celular")
	private int numeroCelular;
	@Column(name = "numero_telefono")
	private int numeroTelefono;
	@Column(name = "sueldo")
	private int sueldo;
	@Column(name = "motivo_retiro")
	private String motivoRetiro;
	@Column(name = "nombre_jefe")
	private String nombreJefe;
	@Column(name = "pagina_web")
	private String paginaWeb;
	
	
	public ExperienciaLaboral() {
		
	}


	public ExperienciaLaboral(int id, String numeroDocumentoAspirante, String empresa, String direccion,
			String departamentoDireccion, String ciudadDireccion, String cargo, int tiempoMeses, int numeroCelular,
			int numeroTelefono, int sueldo, String motivoRetiro, String nombreJefe, String paginaWeb) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.empresa = empresa;
		this.direccion = direccion;
		this.departamentoDireccion = departamentoDireccion;
		this.ciudadDireccion = ciudadDireccion;
		this.cargo = cargo;
		this.tiempoMeses = tiempoMeses;
		this.numeroCelular = numeroCelular;
		this.numeroTelefono = numeroTelefono;
		this.sueldo = sueldo;
		this.motivoRetiro = motivoRetiro;
		this.nombreJefe = nombreJefe;
		this.paginaWeb = paginaWeb;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
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


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public int getTiempoMeses() {
		return tiempoMeses;
	}


	public void setTiempoMeses(int tiempoMeses) {
		this.tiempoMeses = tiempoMeses;
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


	public int getSueldo() {
		return sueldo;
	}


	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}


	public String getMotivoRetiro() {
		return motivoRetiro;
	}


	public void setMotivoRetiro(String motivoRetiro) {
		this.motivoRetiro = motivoRetiro;
	}


	public String getNombreJefe() {
		return nombreJefe;
	}


	public void setNombreJefe(String nombreJefe) {
		this.nombreJefe = nombreJefe;
	}


	public String getPaginaWeb() {
		return paginaWeb;
	}


	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
}