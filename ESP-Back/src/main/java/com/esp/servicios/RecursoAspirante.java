package com.esp.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esp.entidades.Aspirante;
import com.esp.entidades.CompaneraSentimental;
import com.esp.entidades.Hijo;
import com.esp.entidades.LibretaMilitar;
import com.esp.entidades.Progenitor;
import com.esp.repositorio.AspiranteRepository;
import com.esp.repositorio.CompaneraSentimentalRepository;
import com.esp.repositorio.EstudioAcademicoRepository;
import com.esp.repositorio.HermanoRepository;
import com.esp.repositorio.HijoRepository;
import com.esp.repositorio.LibretaMilitarRepository;
import com.esp.repositorio.ProgenitorRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/esp")
public class RecursoAspirante {
	
	@Autowired
	
	private AspiranteRepository aspiranteRepo;
	private LibretaMilitarRepository libretaMilitarRepo;
	private CompaneraSentimentalRepository companeraSentimentalRepo;
	private HijoRepository hijoRepo;
	private ProgenitorRepository progenitorRepo;
	private HermanoRepository hermanoRepo;
	private EstudioAcademicoRepository EstudioAcademicoRepo;
	
	
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
	
	
	@PostMapping(value = "/insertarCompaneraSentimental")
	private String insertarCompaneraSentimental(@RequestBody CompaneraSentimental companeraSentimental) {		
		companeraSentimentalRepo.save(companeraSentimental);		
		return "Insertado el Aspirante: " + companeraSentimental.getNumeroDocumentoAspirante();
	}
	
	
	@PostMapping(value = "/insertarHijo")
	private String insertarHijo(@RequestBody Hijo hijo) {		
		hijoRepo.save(hijo);
		return "Insertado el Aspirante: " + hijo.getNumeroDocumentoAspirante();
	}
	
	
	@PostMapping(value = "/insertarProgenitor")
	private String insertarProgenitor(@RequestBody Progenitor progenitor) {		
		progenitorRepo.save(progenitor);
		return "Insertado el Aspirante: " + progenitor.getNumeroDocumentoAspirante();
	}
}