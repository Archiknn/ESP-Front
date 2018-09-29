package com.esp.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "viajes", schema = "ESP")
public class Viajes {
	
	@Id
	@GeneratedValue
	
	@Column(name = "id_viaje")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "fecha")
	private Date fecha;
	@Column(name = "motivo")
	private String motivo;
	@Column(name = "tiempo_meses")
	private int tiempoMeses;
	@Column(name = "actividades")
	private String  actividades;
	
	
	public Viajes() {
		
	}


	public Viajes(String id, String numeroDocumentoAspirante, Date fecha, String motivo, int tiempoMeses,
			String actividades) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.fecha = fecha;
		this.motivo = motivo;
		this.tiempoMeses = tiempoMeses;
		this.actividades = actividades;
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

	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getTiempoMeses() {
		return tiempoMeses;
	}
	public void setTiempoMeses(int tiempoMeses) {
		this.tiempoMeses = tiempoMeses;
	}

	public String getActividades() {
		return actividades;
	}
	public void setActividades(String actividades) {
		this.actividades = actividades;
	}
}