package com.esp.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "aspirante", schema = "ESP")
public class Aspirante {

	@Column(name = "primer_apellido")
	private String primerApellido;
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	@Column(name = "primer_nombre")
	private String primerNombre;
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	@Column(name = "numero_documento")
	private String numeroDocumento;
	@Column(name = "fecha_expedicion_documento")
	private Date fechaExpedicionDocumento;
	@Column(name = "pais_expedicion_documento")
	private String paisExpedicionDocumento;
	@Column(name = "departamento_expedicion_documento")
	private String departamentoExpedicionDocumento;
	@Column(name = "ciudad_expedicion_documento")
	private String ciudadExpedicionDocumento;
	@Column(name = "numero_pasaporte")
	private String numeroPasaporte;
	@Column(name = "departamento_expedicion_pasaporte")
	private String departamentoExpedicionPasaporte;
	@Column(name = "ciudad_expedicion_pasaporte")
	private String ciudadExpedicionPasaporte;
	@Column(name = "pais_nacimiento")
	private String paisNacimiento;
	@Column(name = "departamento_nacimiento")
	private String departamentoNacimiento;
	@Column(name = "ciudad_nacimiento")
	private String ciudadNacimiento;
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(name = "grupo_sanguineo")
	private String grupoSanguineo;
	@Column(name = "ocupacion")
	private String ocupacion;
	@Column(name = "numero_tarjeta_profesional")
	private String numeroTarjetaProfesional;
	@Column(name = "estarura")
	private int estatura;
	@Column(name = "peso")
	private int peso;
	@Column(name = "direccion_actual")
	private String direccionActual;
	@Column(name = "barrio_actual")
	private String barrioActual;
	@Column(name = "departamento_direccion_actual")
	private String departamentoDireccionActual;
	@Column(name = "ciudad_direccion_actual")
	private String ciudadDireccionActual;
	@Column(name = "direccion_anterior")
	private String direccionAnterior;
	@Column(name = "barrio_anterior")
	private String barrioAnterior;
	@Column(name = "departamento_direccion_anterior")
	private String departamentoDireccionAnterior;
	@Column(name = "ciudad_direccion_anterior")
	private String ciudadDireccionAnterior;
	@Column(name = "numero_celular")
	private int numeroCelular;
	@Column(name = "numero_telefono_actual")
	private int numeroTelefonoActual;
	@Column(name = "numero_telefono_anterior")
	private int numeroTelefonoAnterior;
	@Column(name = "correo_electronico")
	private String correoElectronico;
	@Column(name = "redes_sociales")
	private String redesSociales;

//	private LibretaMilitar libretaMilitar;

	public Aspirante() {
	}

	public Aspirante(String primerApellido, String segundoApellido, String primerNombre, String segundoNombre,
			String tipoDocumento, String numeroDocumento, Date fechaExpedicionDocumento, String paisExpedicionDocumento,
			String departamentoExpedicionDocumento, String ciudadExpedicionDocumento, String numeroPasaporte,
			String departamentoExpedicionPasaporte, String ciudadExpedicionPasaporte, String paisNacimiento,
			String departamentoNacimiento, String ciudadNacimiento, Date fechaNacimiento, String grupoSanguineo,
			String ocupacion, String numeroTarjetaProfesional, int estatura, int peso, String direccionActual,
			String barrioActual, String departamentoDireccionActual, String ciudadDireccionActual,
			String direccionAnterior, String barrioAnterior, String departamentoDireccionAnterior,
			String ciudadDireccionAnterior, int numeroCelular, int numeroTelefonoActual, int numeroTelefonoAnterior,
			String correoElectronico, String redesSociales) {
		super();
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.fechaExpedicionDocumento = fechaExpedicionDocumento;
		this.paisExpedicionDocumento = paisExpedicionDocumento;
		this.departamentoExpedicionDocumento = departamentoExpedicionDocumento;
		this.ciudadExpedicionDocumento = ciudadExpedicionDocumento;
		this.numeroPasaporte = numeroPasaporte;
		this.departamentoExpedicionPasaporte = departamentoExpedicionPasaporte;
		this.ciudadExpedicionPasaporte = ciudadExpedicionPasaporte;
		this.paisNacimiento = paisNacimiento;
		this.departamentoNacimiento = departamentoNacimiento;
		this.ciudadNacimiento = ciudadNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.grupoSanguineo = grupoSanguineo;
		this.ocupacion = ocupacion;
		this.numeroTarjetaProfesional = numeroTarjetaProfesional;
		this.estatura = estatura;
		this.peso = peso;
		this.direccionActual = direccionActual;
		this.barrioActual = barrioActual;
		this.departamentoDireccionActual = departamentoDireccionActual;
		this.ciudadDireccionActual = ciudadDireccionActual;
		this.direccionAnterior = direccionAnterior;
		this.barrioAnterior = barrioAnterior;
		this.departamentoDireccionAnterior = departamentoDireccionAnterior;
		this.ciudadDireccionAnterior = ciudadDireccionAnterior;
		this.numeroCelular = numeroCelular;
		this.numeroTelefonoActual = numeroTelefonoActual;
		this.numeroTelefonoAnterior = numeroTelefonoAnterior;
		this.correoElectronico = correoElectronico;
		this.redesSociales = redesSociales;
	}

	@Id()
	@GeneratedValue(generator = "uuid") // (strategy = GenerationType.AUTO)//
	@GenericGenerator(name = "uuid", strategy = "uuid2")

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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Date getFechaExpedicionDocumento() {
		return fechaExpedicionDocumento;
	}

	public void setFechaExpedicionDocumento(Date fechaExpedicionDocumento) {
		this.fechaExpedicionDocumento = fechaExpedicionDocumento;
	}

	public String getPaisExpedicionDocumento() {
		return paisExpedicionDocumento;
	}

	public void setPaisExpedicionDocumento(String paisExpedicionDocumento) {
		this.paisExpedicionDocumento = paisExpedicionDocumento;
	}

	public String getDepartamentoExpedicionDocumento() {
		return departamentoExpedicionDocumento;
	}

	public void setDepartamentoExpedicionDocumento(String departamentoExpedicionDocumento) {
		this.departamentoExpedicionDocumento = departamentoExpedicionDocumento;
	}

	public String getCiudadExpedicionDocumento() {
		return ciudadExpedicionDocumento;
	}

	public void setCiudadExpedicionDocumento(String ciudadExpedicionDocumento) {
		this.ciudadExpedicionDocumento = ciudadExpedicionDocumento;
	}

	public String getNumeroPasaporte() {
		return numeroPasaporte;
	}

	public void setNumeroPasaporte(String numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}

	public String getDepartamentoExpedicionPasaporte() {
		return departamentoExpedicionPasaporte;
	}

	public void setDepartamentoExpedicionPasaporte(String departamentoExpedicionPasaporte) {
		this.departamentoExpedicionPasaporte = departamentoExpedicionPasaporte;
	}

	public String getCiudadExpedicionPasaporte() {
		return ciudadExpedicionPasaporte;
	}

	public void setCiudadExpedicionPasaporte(String ciudadExpedicionPasaporte) {
		this.ciudadExpedicionPasaporte = ciudadExpedicionPasaporte;
	}

	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	public String getDepartamentoNacimiento() {
		return departamentoNacimiento;
	}

	public void setDepartamentoNacimiento(String departamentoNacimiento) {
		this.departamentoNacimiento = departamentoNacimiento;
	}

	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}

	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getNumeroTarjetaProfesional() {
		return numeroTarjetaProfesional;
	}

	public void setNumeroTarjetaProfesional(String numeroTarjetaProfesional) {
		this.numeroTarjetaProfesional = numeroTarjetaProfesional;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getDireccionActual() {
		return direccionActual;
	}

	public void setDireccionActual(String direccionActual) {
		this.direccionActual = direccionActual;
	}

	public String getBarrioActual() {
		return barrioActual;
	}

	public void setBarrioActual(String barrioActual) {
		this.barrioActual = barrioActual;
	}

	public String getDepartamentoDireccionActual() {
		return departamentoDireccionActual;
	}

	public void setDepartamentoDireccionActual(String departamentoDireccionActual) {
		this.departamentoDireccionActual = departamentoDireccionActual;
	}

	public String getCiudadDireccionActual() {
		return ciudadDireccionActual;
	}

	public void setCiudadDireccionActual(String ciudadDireccionActual) {
		this.ciudadDireccionActual = ciudadDireccionActual;
	}

	public String getDireccionAnterior() {
		return direccionAnterior;
	}

	public void setDireccionAnterior(String direccionAnterior) {
		this.direccionAnterior = direccionAnterior;
	}

	public String getBarrioAnterior() {
		return barrioAnterior;
	}

	public void setBarrioAnterior(String barrioAnterior) {
		this.barrioAnterior = barrioAnterior;
	}

	public String getDepartamentoDireccionAnterior() {
		return departamentoDireccionAnterior;
	}

	public void setDepartamentoDireccionAnterior(String departamentoDireccionAnterior) {
		this.departamentoDireccionAnterior = departamentoDireccionAnterior;
	}

	public String getCiudadDireccionAnterior() {
		return ciudadDireccionAnterior;
	}

	public void setCiudadDireccionAnterior(String ciudadDireccionAnterior) {
		this.ciudadDireccionAnterior = ciudadDireccionAnterior;
	}

	public int getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public int getNumeroTelefonoActual() {
		return numeroTelefonoActual;
	}

	public void setNumeroTelefonoActual(int numeroTelefonoActual) {
		this.numeroTelefonoActual = numeroTelefonoActual;
	}

	public int getNumeroTelefonoAnterior() {
		return numeroTelefonoAnterior;
	}

	public void setNumeroTelefonoAnterior(int numeroTelefonoAnterior) {
		this.numeroTelefonoAnterior = numeroTelefonoAnterior;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

//	public String toString() {
//		return String.format("primerApellido:%s,segundoApellido:%s,primerNombre:%s", primerApellido, segundoApellido,
//				primerNombre);
//	}
}