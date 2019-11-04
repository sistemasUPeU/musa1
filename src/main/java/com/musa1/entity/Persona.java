package com.musa1.entity;

public class Persona {
	int id_persona;
	String nombre_persona;
	String apellido_paterno;
	String apellido_materno;
	String nro_documento;
	String celular;
	int id_tipo_documento;
	
	public Persona() {
		super();
	}

	public Persona(int id_persona, String nombre_persona, String apellido_paterno, String apellido_materno,
			String nro_documento, String celular, int id_tipo_documento) {
		super();
		this.id_persona = id_persona;
		this.nombre_persona = nombre_persona;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.nro_documento = nro_documento;
		this.celular = celular;
		this.id_tipo_documento = id_tipo_documento;
	}
	
	

	public Persona(String nombre_persona, String apellido_paterno, String apellido_materno, String nro_documento,
			String celular, int id_tipo_documento) {
		super();
		this.nombre_persona = nombre_persona;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.nro_documento = nro_documento;
		this.celular = celular;
		this.id_tipo_documento = id_tipo_documento;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombre_persona() {
		return nombre_persona;
	}

	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getNro_documento() {
		return nro_documento;
	}

	public void setNro_documento(String nro_documento) {
		this.nro_documento = nro_documento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getId_tipo_documento() {
		return id_tipo_documento;
	}

	public void setId_tipo_documento(int id_tipo_documento) {
		this.id_tipo_documento = id_tipo_documento;
	}
	
}
