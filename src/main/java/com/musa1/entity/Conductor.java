package com.musa1.entity;

public class Conductor {
	String licencia;
	String carnet_c;
	String f_caducidad;
	int estado;
	int id_persona;
	public Conductor(String licencia, String carnet_c, String f_caducidad, int estado, int id_persona) {
		super();
		this.licencia = licencia;
		this.carnet_c = carnet_c;
		this.f_caducidad = f_caducidad;
		this.estado = estado;
		this.id_persona = id_persona;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public String getCarnet_c() {
		return carnet_c;
	}
	public void setCarnet_c(String carnet_c) {
		this.carnet_c = carnet_c;
	}
	public String getF_caducidad() {
		return f_caducidad;
	}
	public void setF_caducidad(String f_caducidad) {
		this.f_caducidad = f_caducidad;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	
}
