package com.musa1.entity;

public class Detalle_pedido {

	public int id_detalle_pedido;
	public int id_pedido;
	public int id_producto;
	public Detalle_pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle_pedido(int id_detalle_pedido, int id_pedido, int id_producto) {
		super();
		this.id_detalle_pedido = id_detalle_pedido;
		this.id_pedido = id_pedido;
		this.id_producto = id_producto;
	}
	public int getId_detalle_pedido() {
		return id_detalle_pedido;
	}
	public void setId_detalle_pedido(int id_detalle_pedido) {
		this.id_detalle_pedido = id_detalle_pedido;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	
}
