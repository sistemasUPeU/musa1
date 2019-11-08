package com.musa1.entity;

public class Categoria {
	int id_categoria;
	String nombre_categoria;
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categoria(int id_categoria, String nombre_categoria) {
		super();
		this.id_categoria = id_categoria;
		this.nombre_categoria = nombre_categoria;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre_categoria() {
		return nombre_categoria;
	}
	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	
}
