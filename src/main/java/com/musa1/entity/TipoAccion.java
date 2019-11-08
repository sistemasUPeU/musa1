package com.musa1.entity;

public class TipoAccion {
	private int id_tipo_accion;
	private String nom_tipo_accion;
	private String estado;
	public TipoAccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoAccion(int id_tipo_accion, String nom_tipo_accion, String estado) {
		super();
		this.id_tipo_accion = id_tipo_accion;
		this.nom_tipo_accion = nom_tipo_accion;
		this.estado = estado;
	}
	public int getId_tipo_accion() {
		return id_tipo_accion;
	}
	public void setId_tipo_accion(int id_tipo_accion) {
		this.id_tipo_accion = id_tipo_accion;
	}
	public String getNom_tipo_accion() {
		return nom_tipo_accion;
	}
	public void setNom_tipo_accion(String nom_tipo_accion) {
		this.nom_tipo_accion = nom_tipo_accion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
