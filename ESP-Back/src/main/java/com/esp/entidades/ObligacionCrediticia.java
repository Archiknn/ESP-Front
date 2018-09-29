package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "obligaciones_crediticias", schema = "ESP")
public class ObligacionCrediticia {
	
	@Id
	@GeneratedValue
	
	@Column(name = "id_obligacion")
	private String id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "entidad")
	private String entidad;
	@Column(name = "valor")
	private int valor;
	@Column(name = "concepto")
	private String concepto;
	
	
	public ObligacionCrediticia() {
		
	}


	public ObligacionCrediticia(String id, String numeroDocumentoAspirante, String entidad, int valor,
			String concepto) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.entidad = entidad;
		this.valor = valor;
		this.concepto = concepto;
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

	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
}