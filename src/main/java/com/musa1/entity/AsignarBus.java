package com.musa1.entity;

public class AsignarBus {
	int id_detalle_bus_grupo;
	int fijo;
	int id_paradero;
	int id_bus;
	int id_orden_grupo;
	
	public AsignarBus() {
		super();
	}

	public AsignarBus(int id_detalle_bus_grupo, int fijo, int id_paradero, int id_bus, int id_orden_grupo) {
		super();
		this.id_detalle_bus_grupo = id_detalle_bus_grupo;
		this.fijo = fijo;
		this.id_paradero = id_paradero;
		this.id_bus = id_bus;
		this.id_orden_grupo = id_orden_grupo;
	}

	public int getId_detalle_bus_grupo() {
		return id_detalle_bus_grupo;
	}

	public void setId_detalle_bus_grupo(int id_detalle_bus_grupo) {
		this.id_detalle_bus_grupo = id_detalle_bus_grupo;
	}

	public int getFijo() {
		return fijo;
	}

	public void setFijo(int fijo) {
		this.fijo = fijo;
	}

	public int getId_paradero() {
		return id_paradero;
	}

	public void setId_paradero(int id_paradero) {
		this.id_paradero = id_paradero;
	}

	public int getId_bus() {
		return id_bus;
	}

	public void setId_bus(int id_bus) {
		this.id_bus = id_bus;
	}

	public int getId_orden_grupo() {
		return id_orden_grupo;
	}

	public void setId_orden_grupo(int id_orden_grupo) {
		this.id_orden_grupo = id_orden_grupo;
	}
	
	
	

}
