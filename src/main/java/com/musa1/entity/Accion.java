package com.musa1.entity;

public class Accion {
	private int id_accion;
	private String nom_accion;
	private String estado;
	private int id_tipo_accion;
	public Accion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accion(int id_accion, String nom_accion, String estado, int id_tipo_accion) {
		super();
		this.id_accion = id_accion;
		this.nom_accion = nom_accion;
		this.estado = estado;
		this.id_tipo_accion = id_tipo_accion;
	}
	public int getId_accion() {
		return id_accion;
	}
	public void setId_accion(int id_accion) {
		this.id_accion = id_accion;
	}
	public String getNom_accion() {
		return nom_accion;
	}
	public void setNom_accion(String nom_accion) {
		this.nom_accion = nom_accion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId_tipo_accion() {
		return id_tipo_accion;
	}
	public void setId_tipo_accion(int id_tipo_accion) {
		this.id_tipo_accion = id_tipo_accion;
	}
	
	

}
