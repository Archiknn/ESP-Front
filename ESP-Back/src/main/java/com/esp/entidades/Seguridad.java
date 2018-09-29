package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "seguridad", schema = "ESP")
public class Seguridad {
	
	@Id
	@GeneratedValue
	
	@Column(name = "id_seguridad")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "concepto_margen_ley")
	private String conceptoMargenLey;
	@Column(name = "informacion_riesgo")
	private boolean informacionRiesgo;
	@Column(name = "detalle_informacion_riesgo")
	private String detalleInformacionRiesgo;
	@Column(name = "informacion_corrupcion")
	private boolean informacionCorrupcion;
	@Column(name = "detalle_informacion_corrupcion")
	private String detalleInformacionCorrupcion;
	
	
	public Seguridad() {
		
	}


	public Seguridad(String id, String numeroDocumentoAspirante, String conceptoMargenLey, boolean informacionRiesgo,
			String detalleInformacionRiesgo, boolean informacionCorrupcion, String detalleInformacionCorrupcion) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.conceptoMargenLey = conceptoMargenLey;
		this.informacionRiesgo = informacionRiesgo;
		this.detalleInformacionRiesgo = detalleInformacionRiesgo;
		this.informacionCorrupcion = informacionCorrupcion;
		this.detalleInformacionCorrupcion = detalleInformacionCorrupcion;
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


	public String getConceptoMargenLey() {
		return conceptoMargenLey;
	}


	public void setConceptoMargenLey(String conceptoMargenLey) {
		this.conceptoMargenLey = conceptoMargenLey;
	}


	public boolean isInformacionRiesgo() {
		return informacionRiesgo;
	}


	public void setInformacionRiesgo(boolean informacionRiesgo) {
		this.informacionRiesgo = informacionRiesgo;
	}


	public String getDetalleInformacionRiesgo() {
		return detalleInformacionRiesgo;
	}


	public void setDetalleInformacionRiesgo(String detalleInformacionRiesgo) {
		this.detalleInformacionRiesgo = detalleInformacionRiesgo;
	}


	public boolean isInformacionCorrupcion() {
		return informacionCorrupcion;
	}


	public void setInformacionCorrupcion(boolean informacionCorrupcion) {
		this.informacionCorrupcion = informacionCorrupcion;
	}


	public String getDetalleInformacionCorrupcion() {
		return detalleInformacionCorrupcion;
	}


	public void setDetalleInformacionCorrupcion(String detalleInformacionCorrupcion) {
		this.detalleInformacionCorrupcion = detalleInformacionCorrupcion;
	}
}