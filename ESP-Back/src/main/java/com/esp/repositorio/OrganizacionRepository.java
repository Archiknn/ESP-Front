package com.esp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esp.entidades.Organizaciones;

public interface OrganizacionRepository<T> extends JpaRepository<Organizaciones, T> {

}