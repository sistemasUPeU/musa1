package com.musa1.entity;

public class Tipo_vinculacion {
	int id_tipo_vinculacion;
	String vinculacion;
	String estado;
	public Tipo_vinculacion(int id_tipo_vinculacion, String vinculacion, String estado) {
		super();
		this.id_tipo_vinculacion = id_tipo_vinculacion;
		this.vinculacion = vinculacion;
		this.estado = estado;
	}
	public int getId_tipo_vinculacion() {
		return id_tipo_vinculacion;
	}
	public void setId_tipo_vinculacion(int id_tipo_vinculacion) {
		this.id_tipo_vinculacion = id_tipo_vinculacion;
	}
	public String getVinculacion() {
		return vinculacion;
	}
	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
