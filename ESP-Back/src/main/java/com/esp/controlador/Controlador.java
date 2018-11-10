package com.esp.controlador;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import com.esp.entidades.Aspirante;
import com.esp.repositorio.AspiranteRepository;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Controller

public class Controlador {
	
	@Autowired
	private AspiranteRepository aspiranteRespository;

	public void insertarDatos(String datosJson){
		
		Aspirante aspirante = new Aspirante();
		Aspirante aspirante_1 = new Aspirante();
		
		JsonElement jelement = new JsonParser().parse(datosJson);
		JsonObject jobject = jelement.getAsJsonObject();
		jobject = jobject.getAsJsonObject("aspirante");
		JsonObject libreta = jelement.getAsJsonObject();
		libreta = libreta.getAsJsonObject("libretaMilitar");
		
		System.out.println("****ASPIRANTE--> " + jobject.toString());
		System.out.println("****LIBRETA MILITAR--> " + libreta.toString());
		
		aspirante = new Gson().fromJson(jobject.toString(), Aspirante.class);
		
		aspirante_1.setPrimerApellido(aspirante.getPrimerApellido());
		aspirante_1.setNumeroDocumento(aspirante.getNumeroDocumento());
		
		aspiranteRespository.save(aspirante_1);
		
//		System.out.println(aspirante.getPrimerApellido());
		}
}