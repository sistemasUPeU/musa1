package com.musa1.entity;

public class Tipo_requisito {
	int id_tipo_requisito;
	String requisito;
	String estado;
	public Tipo_requisito(int id_tipo_requisito, String requisito, String estado) {
		super();
		this.id_tipo_requisito = id_tipo_requisito;
		this.requisito = requisito;
		this.estado = estado;
	}
	public int getId_tipo_requisito() {
		return id_tipo_requisito;
	}
	public void setId_tipo_requisito(int id_tipo_requisito) {
		this.id_tipo_requisito = id_tipo_requisito;
	}
	public String getRequisito() {
		return requisito;
	}
	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
