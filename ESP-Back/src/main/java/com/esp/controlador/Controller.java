package com.esp.controlador;

import com.esp.repositorio.AspiranteRepository;
import com.esp.repositorio.LibretaMilitarRepository;
import com.google.gson.Gson;

public class Controller {
	
	private AspiranteRepository aspiranteRepo;
	private LibretaMilitarRepository libretaMilitarRepo;
	
	public String insertarDatos(String datosJson) {
		
		String data = new Gson().fromJson(datosJson, String.class);
		
		
		
		return "Datos insertados!";
	}
}