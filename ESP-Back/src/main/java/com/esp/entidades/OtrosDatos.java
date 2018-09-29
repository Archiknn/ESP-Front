package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "otros_datos", schema = "ESP")
public class OtrosDatos {
	
	@Id
	@GeneratedValue
	
	@Column(name = "id_otros")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "conocimiento_empleo")
	private String conocimientoEmpleo;
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
	@Column(name = "razon_vinculacion")
	private int razonVinculacion;
	@Column(name = "datos_adicionales")
	private int datosAdicionales;
	
	
	public OtrosDatos() {
		
	}


	public OtrosDatos(String id, String numeroDocumentoAspirante, String conocimientoEmpleo, String direccion,
			String departamentoDireccion, String ciudadDireccion, int numeroCelular, int numeroTelefono,
			int razonVinculacion, int datosAdicionales) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.conocimientoEmpleo = conocimientoEmpleo;
		this.direccion = direccion;
		this.departamentoDireccion = departamentoDireccion;
		this.ciudadDireccion = ciudadDireccion;
		this.numeroCelular = numeroCelular;
		this.numeroTelefono = numeroTelefono;
		this.razonVinculacion = razonVinculacion;
		this.datosAdicionales = datosAdicionales;
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
	public String getConocimientoEmpleo() {
		return conocimientoEmpleo;
	}

	public void setConocimientoEmpleo(String conocimientoEmpleo) {
		this.conocimientoEmpleo = conocimientoEmpleo;
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

	public int getRazonVinculacion() {
		return razonVinculacion;
	}
	public void setRazonVinculacion(int razonVinculacion) {
		this.razonVinculacion = razonVinculacion;
	}

	public int getDatosAdicionales() {
		return datosAdicionales;
	}
	public void setDatosAdicionales(int datosAdicionales) {
		this.datosAdicionales = datosAdicionales;
	}
}