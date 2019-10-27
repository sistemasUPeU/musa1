package com.musa1.entity;

import java.sql.Date;

public class Vinculacion {
	private int id_vinculacion;
	private Date f_emision;
	private Date f_termino;
	private int id_bus;
	private int id_persona_conductor;
	private int id_tipo_vinculacion;
	public Vinculacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vinculacion(int id_vinculacion, Date f_emision, Date f_termino, int id_bus, int id_persona_conductor,
			int id_tipo_vinculacion) {
		super();
		this.id_vinculacion = id_vinculacion;
		this.f_emision = f_emision;
		this.f_termino = f_termino;
		this.id_bus = id_bus;
		this.id_persona_conductor = id_persona_conductor;
		this.id_tipo_vinculacion = id_tipo_vinculacion;
	}
	public int getId_vinculacion() {
		return id_vinculacion;
	}
	public void setId_vinculacion(int id_vinculacion) {
		this.id_vinculacion = id_vinculacion;
	}
	public Date getF_emision() {
		return f_emision;
	}
	public void setF_emision(Date f_emision) {
		this.f_emision = f_emision;
	}
	public Date getF_termino() {
		return f_termino;
	}
	public void setF_termino(Date f_termino) {
		this.f_termino = f_termino;
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
	public int getId_tipo_vinculacion() {
		return id_tipo_vinculacion;
	}
	public void setId_tipo_vinculacion(int id_tipo_vinculacion) {
		this.id_tipo_vinculacion = id_tipo_vinculacion;
	}
	
}
