package com.musa1.entity;

public class Requisito {
	private int id_requisito;
	private String nombre_requisito;
	private int estado;
	private int id_tipo_requisito;
	private int obligatorio;
	public Requisito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Requisito(int id_requisito, String nombre_requisito, int estado, int id_tipo_requisito, int obligatorio) {
		super();
		this.id_requisito = id_requisito;
		this.nombre_requisito = nombre_requisito;
		this.estado = estado;
		this.id_tipo_requisito = id_tipo_requisito;
		this.obligatorio = obligatorio;
	}

	public int getId_requisito() {
		return id_requisito;
	}
	public void setId_requisito(int id_requisito) {
		this.id_requisito = id_requisito;
	}
	public String getNombre_requisito() {
		return nombre_requisito;
	}
	public void setNombre_requisito(String nombre_requisito) {
		this.nombre_requisito = nombre_requisito;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getObligatorio() {
		return obligatorio;
	}
	public void setObligatorio(int obligatorio) {
		this.obligatorio = obligatorio;
	}
	public int getId_tipo_requisito() {
		return id_tipo_requisito;
	}
	public void setId_tipo_requisito(int id_tipo_requisito) {
		this.id_tipo_requisito = id_tipo_requisito;
	}
	
}
