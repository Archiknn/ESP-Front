package com.esp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.esp.entidades.CuentaBancaria;


public interface CuentaBancariaRepository extends JpaRepository<CuentaBancaria, Integer>{

}