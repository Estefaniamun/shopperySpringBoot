package com.example.shoppery;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the valoraciones database table.
 * 
 */
@Entity
@Table(name="valoraciones")
@NamedQuery(name="Valoracion.findAll", query="SELECT v FROM Valoracion v")
public class Valoracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String contenido;

	@Column(name="n_estrellas")
	private int nEstrellas;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="productovalorado")
	private Producto producto;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="usuariovalorador")
	private User user;

	public Valoracion() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getNEstrellas() {
		return this.nEstrellas;
	}

	public void setNEstrellas(int nEstrellas) {
		this.nEstrellas = nEstrellas;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}