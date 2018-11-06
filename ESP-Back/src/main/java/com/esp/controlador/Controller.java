package com.esp.controlador;

import com.esp.entidades.Aspirante;
import com.google.gson.Gson;

public class Controller {

	public void insertarDatos(String datosJson){
		
		Aspirante aspirante = new Gson().fromJson(datosJson, Aspirante.class);
		
		System.out.println(aspirante.getPrimerApellido());

	}
}