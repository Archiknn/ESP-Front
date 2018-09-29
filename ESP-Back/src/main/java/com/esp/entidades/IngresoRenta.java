package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingresos_renta", schema = "ESP")
public class IngresoRenta {
	
	@Id
	@GeneratedValue
	
	@Column(name = "id_ingresos")
	private int id;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "salario_ingresos_laborales")
	private String salarioIngresosLaborales;
	@Column(name = "cesantias")
	private int cesantias;
	@Column(name = "arriendos")
	private int arriendos;
	@Column(name = "honorarios")
	private int honorarios;
	@Column(name = "otros_ingresos")
	private int otrosIngresos;
	@Column(name = "otros_ingresos_texto")
	private String otrosIngresosTexto;
	
	
	public IngresoRenta() {
		
	}


	public IngresoRenta(int id, String numeroDocumentoAspirante, String salarioIngresosLaborales, int cesantias,
			int arriendos, int honorarios, int otrosIngresos, String otrosIngresosTexto) {
		super();
		this.id = id;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.salarioIngresosLaborales = salarioIngresosLaborales;
		this.cesantias = cesantias;
		this.arriendos = arriendos;
		this.honorarios = honorarios;
		this.otrosIngresos = otrosIngresos;
		this.otrosIngresosTexto = otrosIngresosTexto;
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

	public String getSalarioIngresosLaborales() {
		return salarioIngresosLaborales;
	}
	public void setSalarioIngresosLaborales(String salarioIngresosLaborales) {
		this.salarioIngresosLaborales = salarioIngresosLaborales;
	}

	public int getCesantias() {
		return cesantias;
	}
	public void setCesantias(int cesantias) {
		this.cesantias = cesantias;
	}

	public int getArriendos() {
		return arriendos;
	}
	public void setArriendos(int arriendos) {
		this.arriendos = arriendos;
	}

	public int getHonorarios() {
		return honorarios;
	}
	public void setHonorarios(int honorarios) {
		this.honorarios = honorarios;
	}

	public int getOtrosIngresos() {
		return otrosIngresos;
	}
	public void setOtrosIngresos(int otrosIngresos) {
		this.otrosIngresos = otrosIngresos;
	}

	public String getOtrosIngresosTexto() {
		return otrosIngresosTexto;
	}
	public void setOtrosIngresosTexto(String otrosIngresosTexto) {
		this.otrosIngresosTexto = otrosIngresosTexto;
	}
}