package com.musa1.entity;

public class TipoMantenimiento {
	int id_tipo_mantenimiento;
	String tipo_mantenimiento;
	
	public TipoMantenimiento(int id_tipo_mantenimiento, String tipo_mantenimiento) {
		super();
		this.id_tipo_mantenimiento = id_tipo_mantenimiento;
		this.tipo_mantenimiento = tipo_mantenimiento;
	}

	public int getId_tipo_mantenimiento() {
		return id_tipo_mantenimiento;
	}

	public void setId_tipo_mantenimiento(int id_tipo_mantenimiento) {
		this.id_tipo_mantenimiento = id_tipo_mantenimiento;
	}

	public String getTipo_mantenimiento() {
		return tipo_mantenimiento;
	}

	public void setTipo_mantenimiento(String tipo_mantenimiento) {
		this.tipo_mantenimiento = tipo_mantenimiento;
	}
	
}





