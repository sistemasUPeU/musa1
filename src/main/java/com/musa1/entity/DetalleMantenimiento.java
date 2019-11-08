package com.musa1.entity;

public class DetalleMantenimiento {
	int id_detalle_accion_mant;
	String revision;
	int id_accion;
	int id_mantenimiento;
	public DetalleMantenimiento() {
		super();
	}
	public DetalleMantenimiento(int id_detalle_accion_mant, String revision, int id_accion, int id_mantenimiento) {
		super();
		this.id_detalle_accion_mant = id_detalle_accion_mant;
		this.revision = revision;
		this.id_accion = id_accion;
		this.id_mantenimiento = id_mantenimiento;
	}
	public int getId_detalle_accion_mant() {
		return id_detalle_accion_mant;
	}
	public void setId_detalle_accion_mant(int id_detalle_accion_mant) {
		this.id_detalle_accion_mant = id_detalle_accion_mant;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public int getId_accion() {
		return id_accion;
	}
	public void setId_accion(int id_accion) {
		this.id_accion = id_accion;
	}
	public int getId_mantenimiento() {
		return id_mantenimiento;
	}
	public void setId_mantenimiento(int id_mantenimiento) {
		this.id_mantenimiento = id_mantenimiento;
	}
}
