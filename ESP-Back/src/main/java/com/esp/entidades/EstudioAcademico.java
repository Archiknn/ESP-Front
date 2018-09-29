package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudio_academico", schema = "ESP")
public class EstudioAcademico {

	@Id
	@GeneratedValue
	
	@Column(name = "id_estudio")
	private int id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "estudio_realizado")
	private String estudioRealizado;
	@Column(name = "ano_finalizacion")
	private int anoFinalizacion;
	@Column(name = "titulo_obtenido")
	private String tituloObtenido;
	@Column(name = "nombre_institucion")
	private String nombreInstitucion;
	@Column(name = "pais")
	private String pais;
	@Column(name = "departamento")
	private String departamento;
	@Column(name = "ciudad")
	private String ciudad;
	
	
	public EstudioAcademico() {
		
	}


	public EstudioAcademico(int id, String numeroDocumentoAspirante, String estudioRealizado, int anoFinalizacion,
			String tituloObtenido, String nombreInstitucion, String pais, String departamento, String ciudad) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.estudioRealizado = estudioRealizado;
		this.anoFinalizacion = anoFinalizacion;
		this.tituloObtenido = tituloObtenido;
		this.nombreInstitucion = nombreInstitucion;
		this.pais = pais;
		this.departamento = departamento;
		this.ciudad = ciudad;
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

	public String getEstudioRealizado() {
		return estudioRealizado;
	}
	public void setEstudioRealizado(String estudioRealizado) {
		this.estudioRealizado = estudioRealizado;
	}

	public int getAnoFinalizacion() {
		return anoFinalizacion;
	}
	public void setAnoFinalizacion(int anoFinalizacion) {
		this.anoFinalizacion = anoFinalizacion;
	}

	public String getTituloObtenido() {
		return tituloObtenido;
	}
	public void setTituloObtenido(String tituloObtenido) {
		this.tituloObtenido = tituloObtenido;
	}


	public String getNombreInstitucion() {
		return nombreInstitucion;
	}


	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}