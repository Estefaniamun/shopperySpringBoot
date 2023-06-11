package com.example.shoppery.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.shoppery.Valoracion;

public interface ValoracionRepositorio extends JpaRepository<Valoracion, Serializable>{
	
	@Bean
	public abstract List<Valoracion> findAll();

	public abstract Valoracion findById(int id);


	@Transactional
	public abstract void deleteById(int id);

	@Transactional
	public abstract Valoracion save(Valoracion id);

}
