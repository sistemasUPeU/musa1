package com.musa1.entity;

public class TipoAccion {
	private int id_tipo_accion;
	private String tipo_accion;
	private String estado;
	public TipoAccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoAccion(int id_tipo_accion, String tipo_accion, String estado) {
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
