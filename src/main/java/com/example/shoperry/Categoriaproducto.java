package com.example.shoperry;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categoriaproducto database table.
 * 
 */
@Entity
@NamedQuery(name="Categoriaproducto.findAll", query="SELECT c FROM Categoriaproducto c")
public class Categoriaproducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to Descuento
	@OneToMany(mappedBy="categoriaproducto")
	private List<Descuento> descuentos;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="categoriaproducto")
	private List<Producto> productos;

	public Categoriaproducto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Descuento> getDescuentos() {
		return this.descuentos;
	}

	public void setDescuentos(List<Descuento> descuentos) {
		this.descuentos = descuentos;
	}

	public Descuento addDescuento(Descuento descuento) {
		getDescuentos().add(descuento);
		descuento.setCategoriaproducto(this);

		return descuento;
	}

	public Descuento removeDescuento(Descuento descuento) {
		getDescuentos().remove(descuento);
		descuento.setCategoriaproducto(null);

		return descuento;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setCategoriaproducto(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setCategoriaproducto(null);

		return producto;
	}

}