package com.musa1.entity;

public class TipoDocumento {
	int id_tipo_documento;
	String nombre_documento;
	public TipoDocumento(int id_tipo_documento, String nombre_documento) {
		super();
		this.id_tipo_documento = id_tipo_documento;
		this.nombre_documento = nombre_documento;
	}
	public int getId_tipo_documento() {
		return id_tipo_documento;
	}
	public void setId_tipo_documento(int id_tipo_documento) {
		this.id_tipo_documento = id_tipo_documento;
	}
	public String getNombre_documento() {
		return nombre_documento;
	}
	public void setNombre_documento(String nombre_documento) {
		this.nombre_documento = nombre_documento;
	}
	
	
}
