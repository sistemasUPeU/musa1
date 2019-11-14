package com.musa1.entity;

public class Empresa {
	public int id_empresa;
	public String razon_social;
	public String ruc;
	public String responsable_legal;
	public int id_ubigeo;
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empresa(int id_empresa, String razon_social, String ruc, String responsable_legal, int id_ubigeo) {
		super();
		this.id_empresa = id_empresa;
		this.razon_social = razon_social;
		this.ruc = ruc;
		this.responsable_legal = responsable_legal;
		this.id_ubigeo = id_ubigeo;
	}
	public int getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getResponsable_legal() {
		return responsable_legal;
	}
	public void setResponsable_legal(String responsable_legal) {
		this.responsable_legal = responsable_legal;
	}
	public int getId_ubigeo() {
		return id_ubigeo;
	}
	public void setId_ubigeo(int id_ubigeo) {
		this.id_ubigeo = id_ubigeo;
	}
	
	
	
}
