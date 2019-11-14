package com.musa1.entity;

public class CronogramaBus {
	int id_cronoggrama_bus;
	int estado ;
	int id_paradero;
	int id_mes;
	public CronogramaBus(int id_cronoggrama_bus, int estado, int id_paradero, int id_mes) {
		super();
		this.id_cronoggrama_bus = id_cronoggrama_bus;
		this.estado = estado;
		this.id_paradero = id_paradero;
		this.id_mes = id_mes;
	}
	public CronogramaBus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_cronoggrama_bus() {
		return id_cronoggrama_bus;
	}
	public void setId_cronoggrama_bus(int id_cronoggrama_bus) {
		this.id_cronoggrama_bus = id_cronoggrama_bus;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getId_paradero() {
		return id_paradero;
	}
	public void setId_paradero(int id_paradero) {
		this.id_paradero = id_paradero;
	}
	public int getId_mes() {
		return id_mes;
	}
	public void setId_mes(int id_mes) {
		this.id_mes = id_mes;
	}
	
	

}
