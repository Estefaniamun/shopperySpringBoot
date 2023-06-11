package com.example.shoppery.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppery.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Serializable> {
	@Bean

	public abstract List<Producto> findAll();

	public abstract Producto findById(int id);

	@Transactional
	public abstract void deleteById(int id);

}
