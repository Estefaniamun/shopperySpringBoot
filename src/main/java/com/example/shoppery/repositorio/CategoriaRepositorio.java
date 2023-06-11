package com.example.shoppery.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.shoppery.Categoriaproducto;
import com.example.shoppery.Producto;

public interface CategoriaRepositorio extends JpaRepository<Categoriaproducto, Serializable>{
	@Bean
	public abstract List<Categoriaproducto> findAll();

	public abstract List<Categoriaproducto> findByProductos(List<Producto> productos);
	
	public abstract Categoriaproducto findById(int id);



	@Transactional
	public abstract void deleteById(int id);

	@Transactional
	public abstract Categoriaproducto save(Categoriaproducto id);
}
