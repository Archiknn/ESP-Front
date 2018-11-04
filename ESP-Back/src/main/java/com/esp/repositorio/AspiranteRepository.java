package com.esp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.esp.entidades.Aspirante;


public interface AspiranteRepository extends CrudRepository<Aspirante, String>{

}