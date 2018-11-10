package com.esp.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esp.controlador.Controlador;
import com.esp.entidades.Aspirante;
import com.esp.entidades.LibretaMilitar;
import com.esp.repositorio.AspiranteRepository;
import com.esp.repositorio.LibretaMilitarRepository;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/esp")
public class RecursoAspirante {

	@Autowired
	private AspiranteRepository aspiranteRepository;
	private LibretaMilitarRepository libretaMilitarRepository;
		
	@PostMapping(value = "/insertarAspirante")
	//@RequestMapping(value = "/insertarAspirante", method = RequestMethod.POST)
	private String insertarAspirante(@RequestBody String aspirante){
		
//		Controlador controller = new Controlador();
//		
//		controller.insertarDatos(aspirante);
		
		Aspirante aspiranteObj = new Aspirante();
		LibretaMilitar libretaObj = new LibretaMilitar();
		
		JsonElement jelement = new JsonParser().parse(aspirante);
		JsonObject jobject = jelement.getAsJsonObject();
		jobject = jobject.getAsJsonObject("aspirante");
		JsonObject libreta = jelement.getAsJsonObject();
		libreta = libreta.getAsJsonObject("libretaMilitar");
		
		System.out.println("****ASPIRANTE--> " + jobject.toString());
		System.out.println("****LIBRETA MILITAR--> " + libreta.toString());
		
		aspiranteObj = new Gson().fromJson(jobject.toString(), Aspirante.class);
		libretaObj = new Gson().fromJson(jobject.toString(), LibretaMilitar.class);
		
		aspiranteRepository.save(aspiranteObj);
		libretaMilitarRepository.save(libretaObj);
		
		return "Insertado el Aspirante";// + aspirante.getPrimerApellido();
	}
}