package com.example.shoperry.repositorio;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.shoperry.User;
@Repository
public interface UserRepositorio extends JpaRepository<User, Serializable> {

	@Bean
	public abstract List<User> findAll();

	public abstract User findById(int id);

	public abstract User findByNombre(String dni);

	public abstract User findByCorreoAndClave(String correo, String clave);

	@Transactional
	public abstract void deleteById(int id);

	@Transactional
	public abstract User save(User id);

}
