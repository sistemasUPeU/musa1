package com.musa1.entity;

public class Unidad_medida {
	private int id_unidad_medida;
	String unidad_medida;
	
	
	public Unidad_medida() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Unidad_medida(int id_unidad_medida, String unidad_medida) {
		super();
		this.id_unidad_medida = id_unidad_medida;
		this.unidad_medida = unidad_medida;
	}

	public int getId_unidad_medida() {
		return id_unidad_medida;
	}
	public void setId_unidad_medida(int id_unidad_medida) {
		this.id_unidad_medida = id_unidad_medida;
	}
	public String getUnidad_medida() {
		return unidad_medida;
	}
	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}
	
	
}	
