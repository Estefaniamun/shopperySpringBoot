package com.example.shoppery;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detallecompra database table.
 * 
 */
@Entity
@NamedQuery(name="Detallecompra.findAll", query="SELECT d FROM Detallecompra d")
public class Detallecompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int cantidad;

	private float total;

	//bi-directional many-to-one association to Compra
	@ManyToOne
	@JoinColumn(name="compra")
	private Compra compraBean;

	//bi-directional many-to-one association to Descuento
	@ManyToOne
	@JoinColumn(name="descuento")
	private Descuento descuentoBean;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="producto")
	private Producto productoBean;

	public Detallecompra() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Compra getCompraBean() {
		return this.compraBean;
	}

	public void setCompraBean(Compra compraBean) {
		this.compraBean = compraBean;
	}

	public Descuento getDescuentoBean() {
		return this.descuentoBean;
	}

	public void setDescuentoBean(Descuento descuentoBean) {
		this.descuentoBean = descuentoBean;
	}

	public Producto getProductoBean() {
		return this.productoBean;
	}

	public void setProductoBean(Producto productoBean) {
		this.productoBean = productoBean;
	}

}