package com.esp.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esp.controlador.Controller;
import com.esp.repositorio.AspiranteRepository;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/esp")
public class RecursoAspirante {

	@Autowired	
	private AspiranteRepository aspiranteRepo;
		
	@PostMapping(value = "/insertarAspirante")
	//@RequestMapping(value = "/insertarAspirante", method = RequestMethod.POST)
	private String insertarAspirante(@RequestBody String aspirante){
		
		Controller controller = new Controller();
		
		controller.insertarDatos(aspirante);
		
//		aspiranteRepo.save(aspirante);
		
		return "Insertado el Aspirante: ";// + aspirante.getPrimerApellido();
	}
}