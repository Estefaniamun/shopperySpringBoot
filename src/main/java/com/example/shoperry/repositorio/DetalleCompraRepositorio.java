package com.example.shoperry.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface DetalleCompraRepositorio extends JpaRepository<DetalleCompraRepositorio, Serializable>{
	@Bean
	public abstract List<DetalleCompraRepositorio> findAll();

	public abstract DetalleCompraRepositorio findById(int id);


	@Transactional
	public abstract void deleteById(int id);

	@Transactional
	public abstract DetalleCompraRepositorio save(DetalleCompraRepositorio id);

}
