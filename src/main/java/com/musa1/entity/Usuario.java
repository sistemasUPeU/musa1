package com.musa1.entity;

public class Usuario {
	int id_usuario;
	String nom_usuario;
	String contrasena;
	String estado;
	String cod_persona;
	String usuario_creacion;
	String fecha_creacion;
	String usuario_modificacion;
	String fecha_modificacion;
	String super_usuario;
	public Usuario(int id_usuario, String nom_usuario, String contrasena, String estado, String cod_persona,
			String usuario_creacion, String fecha_creacion, String usuario_modificacion, String fecha_modificacion,
			String super_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nom_usuario = nom_usuario;
		this.contrasena = contrasena;
		this.estado = estado;
		this.cod_persona = cod_persona;
		this.usuario_creacion = usuario_creacion;
		this.fecha_creacion = fecha_creacion;
		this.usuario_modificacion = usuario_modificacion;
		this.fecha_modificacion = fecha_modificacion;
		this.super_usuario = super_usuario;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNom_usuario() {
		return nom_usuario;
	}
	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCod_persona() {
		return cod_persona;
	}
	public void setCod_persona(String cod_persona) {
		this.cod_persona = cod_persona;
	}
	public String getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(String usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public String getUsuario_modificacion() {
		return usuario_modificacion;
	}
	public void setUsuario_modificacion(String usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}
	public String getFecha_modificacion() {
		return fecha_modificacion;
	}
	public void setFecha_modificacion(String fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}
	public String getSuper_usuario() {
		return super_usuario;
	}
	public void setSuper_usuario(String super_usuario) {
		this.super_usuario = super_usuario;
	}
	
}
