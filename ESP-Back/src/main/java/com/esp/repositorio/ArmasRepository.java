package com.esp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esp.entidades.Armas;

public interface ArmasRepository<T> extends JpaRepository<Armas, T>{

}