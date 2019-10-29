package com.musa1.entity;

public class VW_Vinculacion {
	private int id_vinculacion;
	private String nombre_propietario;
	private int nro_documento;
	private String placa;
	private String celular;
	private String Requisitos;
	private String f_emision;
	private String f_termino;
	public VW_Vinculacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VW_Vinculacion(int id_vinculacion, String nombre_propietario, int nro_documento, String placa,
			String celular, String requisitos, String f_emision, String f_termino) {
		super();
		this.id_vinculacion = id_vinculacion;
		this.nombre_propietario = nombre_propietario;
		this.nro_documento = nro_documento;
		this.placa = placa;
		this.celular = celular;
		Requisitos = requisitos;
		this.f_emision = f_emision;
		this.f_termino = f_termino;
	}
	public int getId_vinculacion() {
		return id_vinculacion;
	}
	public void setId_vinculacion(int id_vinculacion) {
		this.id_vinculacion = id_vinculacion;
	}
	public String getNombre_propietario() {
		return nombre_propietario;
	}
	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}
	public int getNro_documento() {
		return nro_documento;
	}
	public void setNro_documento(int nro_documento) {
		this.nro_documento = nro_documento;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getRequisitos() {
		return Requisitos;
	}
	public void setRequisitos(String requisitos) {
		Requisitos = requisitos;
	}
	public String getF_emision() {
		return f_emision;
	}
	public void setF_emision(String f_emision) {
		this.f_emision = f_emision;
	}
	public String getF_termino() {
		return f_termino;
	}
	public void setF_termino(String f_termino) {
		this.f_termino = f_termino;
	}
}
