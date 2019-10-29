package com.musa1.entity;

public class Empresa {
	public int id_empresa;
	public String rason_social;
	public String ruc;
	public String responsable_social;
	public int id_ubigeo;
	
	public Empresa() {
		super();
	}
	public Empresa(int id_empresa, String rason_social, String ruc, String responsable_social, int id_ubigeo) {
		super();
		this.id_empresa = id_empresa;
		this.rason_social = rason_social;
		this.ruc = ruc;
		this.responsable_social = responsable_social;
		this.id_ubigeo = id_ubigeo;
	}
	public int getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getRason_social() {
		return rason_social;
	}
	public void setRason_social(String rason_social) {
		this.rason_social = rason_social;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getResponsable_social() {
		return responsable_social;
	}
	public void setResponsable_social(String responsable_social) {
		this.responsable_social = responsable_social;
	}
	public int getId_ubigeo() {
		return id_ubigeo;
	}
	public void setId_ubigeo(int id_ubigeo) {
		this.id_ubigeo = id_ubigeo;
	}
	
}
