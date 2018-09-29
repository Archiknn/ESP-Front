package com.esp.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "antecedentes_judiciales", schema = "ESP")
public class AntecedentesJudiciales {

	@Id
	@GeneratedValue
	
	@Column(name = "id_antecedentes")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "tipo_investigacion")
	private String tipoInvestigacion;
	@Column(name = "causa")
	private String causa;
	@Column(name = "autoridad")
	private String autoridad;
	@Column(name = "responsable")
	private boolean responsable;
	
	
	public AntecedentesJudiciales(){
		
	}


	public AntecedentesJudiciales(String id, String numeroDocumentoAspirante, Date fecha, String tipoInvestigacion,
			String causa, String autoridad, boolean responsable) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.fecha = fecha;
		this.tipoInvestigacion = tipoInvestigacion;
		this.causa = causa;
		this.autoridad = autoridad;
		this.responsable = responsable;
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

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoInvestigacion() {
		return tipoInvestigacion;
	}
	public void setTipoInvestigacion(String tipoInvestigacion) {
		this.tipoInvestigacion = tipoInvestigacion;
	}

	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}

	public String getAutoridad() {
		return autoridad;
	}
	public void setAutoridad(String autoridad) {
		this.autoridad = autoridad;
	}

	public boolean isResponsable() {
		return responsable;
	}
	public void setResponsable(boolean responsable) {
		this.responsable = responsable;
	}
}