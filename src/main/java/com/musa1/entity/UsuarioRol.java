package com.musa1.entity;

public class UsuarioRol {
	int id_usuario;
	int id_rol;
	String fecha_v;
	int id_usuario_rol;
	
	public UsuarioRol(int id_usuario, int id_rol, String fecha_v, int id_usuario_rol) {
		super();
		this.id_usuario = id_usuario;
		this.id_rol = id_rol;
		this.fecha_v = fecha_v;
		this.id_usuario_rol = id_usuario_rol;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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

	public int getId_usuario_rol() {
		return id_usuario_rol;
	}

	public void setId_usuario_rol(int id_usuario_rol) {
		this.id_usuario_rol = id_usuario_rol;
	}
}
