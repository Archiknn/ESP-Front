package com.esp.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import com.esp.entidades.AntecedentesJudiciales;


public interface AntecedentesJudicialesRepository<T> extends JpaRepository<AntecedentesJudiciales, T>{

}