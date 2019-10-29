package com.musa1.entity;

public class Producto {
	int id_producto;
	String nombre_producto;
	String descripcion;
	int id_categoria;
	int id_unidad_medida;
	String codigo;
	int id_marca;
	
	public Producto(int id_producto, String nombre_producto, String descripcion, int id_categoria, int id_unidad_medida,
			String codigo, int id_marca) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.descripcion = descripcion;
		this.id_categoria = id_categoria;
		this.id_unidad_medida = id_unidad_medida;
		this.codigo = codigo;
		this.id_marca = id_marca;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getId_unidad_medida() {
		return id_unidad_medida;
	}

	public void setId_unidad_medida(int id_unidad_medida) {
		this.id_unidad_medida = id_unidad_medida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getId_marca() {
		return id_marca;
	}

	public void setId_marca(int id_marca) {
		this.id_marca = id_marca;
	}
	
	
	
}
