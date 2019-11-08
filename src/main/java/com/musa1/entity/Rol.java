package com.musa1.entity;

public class Rol {
	int id_rol;
	String nom_rol;
	String estado;
	public Rol(int id_rol, String nom_rol, String estado) {
		super();
		this.id_rol = id_rol;
		this.nom_rol = nom_rol;
		this.estado = estado;
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public String getNom_rol() {
		return nom_rol;
	}
	public void setNom_rol(String nom_rol) {
		this.nom_rol = nom_rol;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
