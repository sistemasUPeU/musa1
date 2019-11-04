package com.musa1.entity;

public class Pedido {
	int id_pedido;
	String fecha_pedido;
	String fecha_entrega;
	int id_mantenimiento;
	int persona_autoriza;
	int persona_registra;
	String estado;
	
	public Pedido() {
		super();
	}
	public Pedido(int id_pedido, String fecha_pedido, String fecha_entrega, int id_mantenimiento, int persona_autoriza,
			int persona_registra, String estado) {
		super();
		this.id_pedido = id_pedido;
		this.fecha_pedido = fecha_pedido;
		this.fecha_entrega = fecha_entrega;
		this.id_mantenimiento = id_mantenimiento;
		this.persona_autoriza = persona_autoriza;
		this.persona_registra = persona_registra;
		this.estado = estado;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public String getFecha_pedido() {
		return fecha_pedido;
	}
	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	public String getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public int getId_mantenimiento() {
		return id_mantenimiento;
	}
	public void setId_mantenimiento(int id_mantenimiento) {
		this.id_mantenimiento = id_mantenimiento;
	}
	public int getPersona_autoriza() {
		return persona_autoriza;
	}
	public void setPersona_autoriza(int persona_autoriza) {
		this.persona_autoriza = persona_autoriza;
	}
	public int getPersona_registra() {
		return persona_registra;
	}
	public void setPersona_registra(int persona_registra) {
		this.persona_registra = persona_registra;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
