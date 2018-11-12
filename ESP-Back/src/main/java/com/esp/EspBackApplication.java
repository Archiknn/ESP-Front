package com.esp;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esp.archivos.GuardarFotoAspirante;

@SpringBootApplication
public class EspBackApplication implements CommandLineRunner{
	
	@Resource
	GuardarFotoAspirante storageService;

	public static void main(String[] args) {
		SpringApplication.run(EspBackApplication.class, args);
	}
	
	@Override
	public void run (String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}