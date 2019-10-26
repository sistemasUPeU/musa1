package com.musa1.entity;

public class Tipo_accion {
	private int id_tipo_accion;
	private String tipo_accion;
	private int estado;

	public Tipo_accion(int id_tipo_accion, String tipo_accion, int estado) {
		super();
		this.id_tipo_accion = id_tipo_accion;
		this.tipo_accion = tipo_accion;
		this.estado = estado;
	}
	public int getId_tipo_accion() {
		return id_tipo_accion;
	}
	public void setId_tipo_accion(int id_tipo_accion) {
		this.id_tipo_accion = id_tipo_accion;
	}
	public String getTipo_accion() {
		return tipo_accion;
	}
	public void setTipo_accion(String tipo_accion) {
		this.tipo_accion = tipo_accion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

}
