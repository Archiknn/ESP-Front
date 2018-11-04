package com.esp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esp.entidades.ActividadEconomica;

public interface ActividadEconomicaRepository<T> extends JpaRepository<ActividadEconomica, T>{

}