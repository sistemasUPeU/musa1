package com.musa1.entity;

public class RevisionDetalle {
	int id_revision_detalle;
	String evaluacion;
	int id_revision_tecnica;
	int id_accion;
	
	public RevisionDetalle(int id_revision_detalle, String evaluacion, int id_revision_tecnica, int id_accion) {
		super();
		this.id_revision_detalle = id_revision_detalle;
		this.evaluacion = evaluacion;
		this.id_revision_tecnica = id_revision_tecnica;
		this.id_accion = id_accion;
	}

	public int getId_revision_detalle() {
		return id_revision_detalle;
	}

	public void setId_revision_detalle(int id_revision_detalle) {
		this.id_revision_detalle = id_revision_detalle;
	}

	public String getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}

	public int getId_revision_tecnica() {
		return id_revision_tecnica;
	}

	public void setId_revision_tecnica(int id_revision_tecnica) {
		this.id_revision_tecnica = id_revision_tecnica;
	}

	public int getId_accion() {
		return id_accion;
	}

	public void setId_accion(int id_accion) {
		this.id_accion = id_accion;
	}
	
	
	
}
