package com.esp.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas_bancarias", schema = "ESP")
public class CuentaBancaria {
	
	@Id
	@GeneratedValue
	
	@Column(name = "numero_cuenta")
	private int numeroCuenta;
	@Column(name = "numero_documento_aspirante")
	private String numeroDocumentoAspirante;
	@Column(name = "entidad_financiera")
	private String entidadFinanciera;
	@Column(name = "pais")
	private String pais;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "saldo")
	private int saldo;
	
	
	public CuentaBancaria() {
		
	}


	public CuentaBancaria(int numeroCuenta, String numeroDocumentoAspirante, String entidadFinanciera, String pais,
			String tipo, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
		this.entidadFinanciera = entidadFinanciera;
		this.pais = pais;
		this.tipo = tipo;
		this.saldo = saldo;
	}


	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNumeroDocumentoAspirante() {
		return numeroDocumentoAspirante;
	}
	public void setNumeroDocumentoAspirante(String numeroDocumentoAspirante) {
		this.numeroDocumentoAspirante = numeroDocumentoAspirante;
	}

	public String getEntidadFinanciera() {
		return entidadFinanciera;
	}
	public void setEntidadFinanciera(String entidadFinanciera) {
		this.entidadFinanciera = entidadFinanciera;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}