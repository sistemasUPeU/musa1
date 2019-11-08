package com.musa1.entity;

public class Opcion {
	int id_opcion;
	int padre_id;
	String nom_opcion;
	String descripcion;
	String enlace;
	int orden;
	String estado;
	public Opcion(int id_opcion, int padre_id, String nom_opcion, String descripcion, String enlace, int orden,
			String estado) {
		super();
		this.id_opcion = id_opcion;
		this.padre_id = padre_id;
		this.nom_opcion = nom_opcion;
		this.descripcion = descripcion;
		this.enlace = enlace;
		this.orden = orden;
		this.estado = estado;
	}
	public int getId_opcion() {
		return id_opcion;
	}
	public void setId_opcion(int id_opcion) {
		this.id_opcion = id_opcion;
	}
	public int getPadre_id() {
		return padre_id;
	}
	public void setPadre_id(int padre_id) {
		this.padre_id = padre_id;
	}
	public String getNom_opcion() {
		return nom_opcion;
	}
	public void setNom_opcion(String nom_opcion) {
		this.nom_opcion = nom_opcion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
