package com.musa1.entity;

public class Accion {
	private int a_id;
	private String nom_accion;
	private String estado;
	private int id_tipo_accion;
	
	public Accion() {
		super();
	}
	public Accion(int a_id, String nom_accion, String estado, int id_tipo_accion) {
		super();
		this.a_id = a_id;
		this.nom_accion = nom_accion;
		this.estado = estado;
		this.id_tipo_accion = id_tipo_accion;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
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
