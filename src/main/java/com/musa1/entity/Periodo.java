package com.musa1.entity;

public class Periodo {
	int id_periodo ;
	String nombre_periodo;
	public Periodo(int id_periodo, String nombre_periodo) {
		super();
		this.id_periodo = id_periodo;
		this.nombre_periodo = nombre_periodo;
	}
	public Periodo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_periodo() {
		return id_periodo;
	}
	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}
	public String getNombre_periodo() {
		return nombre_periodo;
	}
	public void setNombre_periodo(String nombre_periodo) {
		this.nombre_periodo = nombre_periodo;
	}
	
	
}
