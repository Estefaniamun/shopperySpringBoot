package com.example.shoperry;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String apellidos;

	private String direccion;

	private String dni;

	private String email;

	private String nombre;

	private String password;

	private String rol;

	//bi-directional many-to-one association to Compra
	@OneToMany(mappedBy="user")
	private List<Compra> compras;

	//bi-directional many-to-one association to Valoracion
	@OneToMany(mappedBy="user")
	private List<Valoracion> valoraciones;

	public User() {
	}

	public User(int id, String nombre, String apellidos, String dni, String email, String password, String direccion, String rol) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.password = password;
		this.direccion = direccion;
		this.rol = rol;
	}
	
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public Compra addCompra(Compra compra) {
		getCompras().add(compra);
		compra.setUser(this);

		return compra;
	}

	public Compra removeCompra(Compra compra) {
		getCompras().remove(compra);
		compra.setUser(null);

		return compra;
	}

	public List<Valoracion> getValoraciones() {
		return this.valoraciones;
	}

	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public Valoracion addValoracione(Valoracion valoracion) {
		getValoraciones().add(valoracion);
		valoracion.setUser(this);

		return valoracion;
	}

	public Valoracion removeValoracione(Valoracion valoracion) {
		getValoraciones().remove(valoracion);
		valoracion.setUser(null);

		return valoracion;
	}

}