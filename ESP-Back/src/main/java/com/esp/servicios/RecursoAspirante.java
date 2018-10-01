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
import com.esp.repositorio.ActividadEconomicaRepository;
import com.esp.repositorio.AntecedentesJudicialesRepository;
import com.esp.repositorio.ArmasRepository;
import com.esp.repositorio.AspiranteRepository;
import com.esp.repositorio.BienPatrimonialRepository;
import com.esp.repositorio.CompaneraSentimentalRepository;
import com.esp.repositorio.CuentaBancariaRepository;
import com.esp.repositorio.EstudioAcademicoRepository;
import com.esp.repositorio.ExperienciaLaboralRepository;
import com.esp.repositorio.HermanoRepository;
import com.esp.repositorio.HijoRepository;
import com.esp.repositorio.IngresoRentaRepository;
import com.esp.repositorio.LibretaMilitarRepository;
import com.esp.repositorio.ObligacionCrediticiaRepository;
import com.esp.repositorio.ProgenitorRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/esp")
public class RecursoAspirante {
	
	@Autowired
	
	
	private ActividadEconomicaRepository actividadEconomicaRepo;
	private AntecedentesJudicialesRepository antecedentesJudicialesRepo;
	private ArmasRepository armasRepo;
	private AspiranteRepository aspiranteRepo;
	private BienPatrimonialRepository bienPatrimonialRepo;
	private CompaneraSentimentalRepository companeraSentimentalRepo;
	private CuentaBancariaRepository cuentaBancariaRepo;
	private EstudioAcademicoRepository estudioAcademicoRepo;
	private ExperienciaLaboralRepository experienciaLaboralRepo;
	private HermanoRepository hermanoRepo;
	private HijoRepository hijoRepo;
	private IngresoRentaRepository ingresoRentaRepo;
	private LibretaMilitarRepository libretaMilitarRepo;
	private ObligacionCrediticiaRepository ObligacionCrediticiaRepo;
	
	
	private ProgenitorRepository progenitorRepo;

	
	
	
	
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