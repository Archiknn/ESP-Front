package com.esp.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.esp.archivos.GuardarFotoAspirante;
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
	@Autowired
	private LibretaMilitarRepository libretaMilitarRepository;
	@Autowired
	GuardarFotoAspirante storageService;
	
	List<String> files = new ArrayList<String>();
		
	@PostMapping(value = "/insertarAspirante")
	private String insertarAspirante(@RequestBody String aspirante){
		
		Aspirante aspiranteObj = new Aspirante();
		LibretaMilitar libretaObj = new LibretaMilitar();
		
		JsonElement jelement = new JsonParser().parse(aspirante);
		JsonObject jobject = jelement.getAsJsonObject();
		jobject = jobject.getAsJsonObject("aspirante");
		JsonObject libreta = jelement.getAsJsonObject();
		libreta = libreta.getAsJsonObject("libretaMilitar");
		
		aspiranteObj = new Gson().fromJson(jobject.toString(), Aspirante.class);
		libretaObj = new Gson().fromJson(libreta.toString(), LibretaMilitar.class);
		
		aspiranteRepository.save(aspiranteObj);
		libretaMilitarRepository.save(libretaObj);
		
		return "{\"respuesta\":\"Insertado_correctamente\"}";
	}
	
	@PostMapping("/recibirArchivo")
	public ResponseEntity<String> subirFoto(@RequestParam("file") MultipartFile archivo) {
		String mensaje = "";
		try {
			storageService.guardar(archivo);
			files.add(archivo.getOriginalFilename());
			
			mensaje = "Subió correctamente " + archivo.getOriginalFilename() + "!";
			return ResponseEntity.status(HttpStatus.OK).body(mensaje);
		} catch (Exception e) {
			mensaje = "Falló la subida de " + archivo.getOriginalFilename() + "!";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(mensaje);
		}
	}
}