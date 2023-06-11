package com.example.shoppery.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CompraRepositorio extends JpaRepository<CompraRepositorio, Serializable>{
	@Bean
	public abstract List<CompraRepositorio> findAll();
	public abstract CompraRepositorio findById(int id);

	
	@Transactional
	public abstract void deleteById(int id);
}
