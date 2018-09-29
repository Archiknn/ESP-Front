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
}