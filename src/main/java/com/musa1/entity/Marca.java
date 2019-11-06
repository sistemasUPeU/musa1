package com.musa1.entity;

public class Marca {
	int id_marca;
	String nombre_marca;
	public Marca() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marca(int id_marca, String nombre_marca) {
		super();
		this.id_marca = id_marca;
		this.nombre_marca = nombre_marca;
	}
	public int getId_marca() {
		return id_marca;
	}
	public void setId_marca(int id_marca) {
		this.id_marca = id_marca;
	}
	public String getNombre_marca() {
		return nombre_marca;
	}
	public void setNombre_marca(String nombre_marca) {
		this.nombre_marca = nombre_marca;
	}
	
}
