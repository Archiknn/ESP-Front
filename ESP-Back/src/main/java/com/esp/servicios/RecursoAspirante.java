package com.esp.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esp.entidades.Aspirante;
import com.esp.entidades.LibretaMilitar;
import com.esp.repositorio.AspiranteRepository;
import com.esp.repositorio.LibretaMilitarRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/esp")
public class RecursoAspirante {
	
	@Autowired
	
	private AspiranteRepository aspiranteRepo;
	private LibretaMilitarRepository libretaMilitarRepo;
	
	
	@PostMapping(value = "/insertarAspirante")
	private String insertarAspirante(@RequestBody Aspirante aspirante) {		
		aspiranteRepo.save(aspirante);		
		return "Insertado el Aspirante: " + aspirante.getNumeroDocumento();
	}
	
	
	
	@PostMapping(value = "/insertarLibretaMilitar")
	private String insertarLibretaMilitar(@RequestBody LibretaMilitar libretaMilitar) {		
		libretaMilitarRepo.save(libretaMilitar);		
		return "Insertado el Aspirante: " + libretaMilitar.getNumeroDocumentoAspirante();
	}
}