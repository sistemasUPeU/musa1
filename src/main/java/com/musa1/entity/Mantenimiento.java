package com.musa1.entity;

public class Mantenimiento {
	int id_mantenimiento;
	String fecha;
	String observacion;
	String estado;
	int id_bus;
	int id_tipo_mantenimiento;
	int id_empleado_registra;
	public Mantenimiento() {
		super();
	}
	public Mantenimiento(int id_mantenimiento, String fecha, String observacion, String estado, int id_bus,
			int id_tipo_mantenimiento, int id_empleado_registra) {
		super();
		this.id_mantenimiento = id_mantenimiento;
		this.fecha = fecha;
		this.observacion = observacion;
		this.estado = estado;
		this.id_bus = id_bus;
		this.id_tipo_mantenimiento = id_tipo_mantenimiento;
		this.id_empleado_registra = id_empleado_registra;
	}
	public int getId_mantenimiento() {
		return id_mantenimiento;
	}
	public void setId_mantenimiento(int id_mantenimiento) {
		this.id_mantenimiento = id_mantenimiento;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getId_bus() {
		return id_bus;
	}
	public void setId_bus(int id_bus) {
		this.id_bus = id_bus;
	}
	public int getId_tipo_mantenimiento() {
		return id_tipo_mantenimiento;
	}
	public void setId_tipo_mantenimiento(int id_tipo_mantenimiento) {
		this.id_tipo_mantenimiento = id_tipo_mantenimiento;
	}
	public int getId_empleado_registra() {
		return id_empleado_registra;
	}
	public void setId_empleado_registra(int id_empleado_registra) {
		this.id_empleado_registra = id_empleado_registra;
	}
	
}
