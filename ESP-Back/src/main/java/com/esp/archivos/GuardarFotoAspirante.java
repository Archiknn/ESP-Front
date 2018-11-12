package com.esp.archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class GuardarFotoAspirante {
	
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	private final Path directorio = Paths.get("Aspirante Foto");

	public void guardar(MultipartFile archivo) {
		try {
			Files.copy(archivo.getInputStream(), this.directorio.resolve(archivo.getOriginalFilename()));
		} catch (Exception e) {
			throw new RuntimeException("FALLO!");
		}
	}
	
//	public Resource loadFile(String nombreArchivo) {
//		try {
//			Path file = directorio.resolve(nombreArchivo);
//			Resource resource = new UrlResource(file.toUri());
//			if(resource.exists() || resource.isReadable()) {
//				return resource;
//			} else {
//				throw new RuntimeException("FALLO!");
//			}
//		} catch (Exception e) {
//			throw new RuntimeException("FALLO!");
//		}
//	}
	
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(directorio.toFile());
	}
	
	public void init() {
		try {
			Files.createDirectory(directorio);
		} catch (Exception e) {
			throw new RuntimeException("Could not initialize storage!");
		}
	}
}