package com.musa1.entity;

public class OpcionUsuario {
	int id_opcion;
	int id_usuario;
	String fecha_vencimiento;
	int opcion_usuario;
	public OpcionUsuario(int id_opcion, int id_usuario, String fecha_vencimiento, int opcion_usuario) {
		super();
		this.id_opcion = id_opcion;
		this.id_usuario = id_usuario;
		this.fecha_vencimiento = fecha_vencimiento;
		this.opcion_usuario = opcion_usuario;
	}
	public int getId_opcion() {
		return id_opcion;
	}
	public void setId_opcion(int id_opcion) {
		this.id_opcion = id_opcion;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public int getOpcion_usuario() {
		return opcion_usuario;
	}
	public void setOpcion_usuario(int opcion_usuario) {
		this.opcion_usuario = opcion_usuario;
	}
	
}
