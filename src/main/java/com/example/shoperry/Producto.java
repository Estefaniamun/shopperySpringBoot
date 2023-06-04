package com.example.shoperry;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	private String foto;

	private String nombre;

	private float precio;

	private Object talla;

	//bi-directional many-to-one association to Detallecompra
	@OneToMany(mappedBy="productoBean")
	private List<Detallecompra> detallecompras;

	//bi-directional many-to-one association to Categoriaproducto
	@ManyToOne
	@JoinColumn(name="categoria")
	private Categoriaproducto categoriaproducto;

	//bi-directional many-to-one association to Valoracion
	@OneToMany(mappedBy="producto")
	private List<Valoracion> valoraciones;

	public Producto() {
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

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Object getTalla() {
		return this.talla;
	}

	public void setTalla(Object talla) {
		this.talla = talla;
	}

	public List<Detallecompra> getDetallecompras() {
		return this.detallecompras;
	}

	public void setDetallecompras(List<Detallecompra> detallecompras) {
		this.detallecompras = detallecompras;
	}

	public Detallecompra addDetallecompra(Detallecompra detallecompra) {
		getDetallecompras().add(detallecompra);
		detallecompra.setProductoBean(this);

		return detallecompra;
	}

	public Detallecompra removeDetallecompra(Detallecompra detallecompra) {
		getDetallecompras().remove(detallecompra);
		detallecompra.setProductoBean(null);

		return detallecompra;
	}

	public Categoriaproducto getCategoriaproducto() {
		return this.categoriaproducto;
	}

	public void setCategoriaproducto(Categoriaproducto categoriaproducto) {
		this.categoriaproducto = categoriaproducto;
	}

	public List<Valoracion> getValoraciones() {
		return this.valoraciones;
	}

	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public Valoracion addValoracione(Valoracion valoracione) {
		getValoraciones().add(valoracione);
		valoracione.setProducto(this);

		return valoracione;
	}

	public Valoracion removeValoracione(Valoracion valoracione) {
		getValoraciones().remove(valoracione);
		valoracione.setProducto(null);

		return valoracione;
	}

}