package com.example.shoperry.repositorio;

import java.io.Serializable;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.shoperry.Descuento;

public interface DescuentoRepositorio extends JpaRepository<DescuentoRepositorio, Serializable>{

	@Bean

	public abstract Descuento findById(int id);

	public abstract Descuento findByNombre(String dni);


	@Transactional
	public abstract void deleteById(int id);

	@Transactional
	public abstract Descuento save(Descuento id);
}
