package com.musa1.entity;

import java.sql.Date;

public class Vinculacion {
	private int id_vinculacion;
	private String f_emision;
	private String f_termino;
	private int id_tipo_vinculacion;
	private int id_bus;
	private int id_persona_conductor;
	private String estado;
	public Vinculacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vinculacion(int id_vinculacion, String f_emision, String f_termino, int id_tipo_vinculacion, int id_bus,
			int id_persona_conductor, String estado) {
		super();
		this.id_vinculacion = id_vinculacion;
		this.f_emision = f_emision;
		this.f_termino = f_termino;
		this.id_tipo_vinculacion = id_tipo_vinculacion;
		this.id_bus = id_bus;
		this.id_persona_conductor = id_persona_conductor;
		this.estado = estado;
	}
	public int getId_vinculacion() {
		return id_vinculacion;
	}
	public void setId_vinculacion(int id_vinculacion) {
		this.id_vinculacion = id_vinculacion;
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
	public int getId_tipo_vinculacion() {
		return id_tipo_vinculacion;
	}
	public void setId_tipo_vinculacion(int id_tipo_vinculacion) {
		this.id_tipo_vinculacion = id_tipo_vinculacion;
	}
	public int getId_bus() {
		return id_bus;
	}
	public void setId_bus(int id_bus) {
		this.id_bus = id_bus;
	}
	public int getId_persona_conductor() {
		return id_persona_conductor;
	}
	public void setId_persona_conductor(int id_persona_conductor) {
		this.id_persona_conductor = id_persona_conductor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}
