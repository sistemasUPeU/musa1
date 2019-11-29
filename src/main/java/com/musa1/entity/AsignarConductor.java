package com.musa1.entity;

public class AsignarConductor {
private int id_detalle_conductor;
private int id_detalle_bus_grupo;
private int id_forma_trabajo;
private int id_persona_conductor;

public AsignarConductor() {
	super();
	// TODO Auto-generated constructor stub
}

public AsignarConductor(int id_detalle_conductor, int id_detalle_bus_grupo, int id_forma_trabajo,
		int id_persona_conductor) {
	super();
	this.id_detalle_conductor = id_detalle_conductor;
	this.id_detalle_bus_grupo = id_detalle_bus_grupo;
	this.id_forma_trabajo = id_forma_trabajo;
	this.id_persona_conductor = id_persona_conductor;
}

public int getId_detalle_conductor() {
	return id_detalle_conductor;
}

public void setId_detalle_conductor(int id_detalle_conductor) {
	this.id_detalle_conductor = id_detalle_conductor;
}

public int getId_detalle_bus_grupo() {
	return id_detalle_bus_grupo;
}

public void setId_detalle_bus_grupo(int id_detalle_bus_grupo) {
	this.id_detalle_bus_grupo = id_detalle_bus_grupo;
}

public int getId_forma_trabajo() {
	return id_forma_trabajo;
}

public void setId_forma_trabajo(int id_forma_trabajo) {
	this.id_forma_trabajo = id_forma_trabajo;
}

public int getId_persona_conductor() {
	return id_persona_conductor;
}

public void setId_persona_conductor(int id_persona_conductor) {
	this.id_persona_conductor = id_persona_conductor;
}



}
