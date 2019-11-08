package com.musa1.entity;

public class OpcionRol {
	int id_opcion;
	int id_rol;
	String fecha_v;
	int id_opcion_rol;
	public OpcionRol(int id_opcion, int id_rol, String fecha_v, int id_opcion_rol) {
		super();
		this.id_opcion = id_opcion;
		this.id_rol = id_rol;
		this.fecha_v = fecha_v;
		this.id_opcion_rol = id_opcion_rol;
	}
	public int getId_opcion() {
		return id_opcion;
	}
	public void setId_opcion(int id_opcion) {
		this.id_opcion = id_opcion;
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public String getFecha_v() {
		return fecha_v;
	}
	public void setFecha_v(String fecha_v) {
		this.fecha_v = fecha_v;
	}
	public int getId_opcion_rol() {
		return id_opcion_rol;
	}
	public void setId_opcion_rol(int id_opcion_rol) {
		this.id_opcion_rol = id_opcion_rol;
	}
	
}
