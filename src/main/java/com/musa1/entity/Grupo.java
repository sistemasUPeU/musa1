package com.musa1.entity;

public class Grupo {
	int id_grupo;
	int numero;
	int cantidad_buses;
	String hora_inicio;
	String hora_fin;
	int intervalo;
	int id_mes;
	int estado;
	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grupo(int id_grupo, int numero, int cantidad_buses, String hora_inicio, String hora_fin, int intervalo,
			int id_mes, int estado) {
		super();
		this.id_grupo = id_grupo;
		this.numero = numero;
		this.cantidad_buses = cantidad_buses;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.intervalo = intervalo;
		this.id_mes = id_mes;
		this.estado = estado;
	}
	public int getId_grupo() {
		return id_grupo;
	}
	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCantidad_buses() {
		return cantidad_buses;
	}
	public void setCantidad_buses(int cantidad_buses) {
		this.cantidad_buses = cantidad_buses;
	}
	public String getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public String getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}
	public int getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
	public int getId_mes() {
		return id_mes;
	}
	public void setId_mes(int id_mes) {
		this.id_mes = id_mes;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
}
