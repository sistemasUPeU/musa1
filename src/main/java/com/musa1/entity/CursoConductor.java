package com.musa1.entity;

public class CursoConductor {
	int id_curso_conductor;
	String f_inicio;
	String f_fin;
	String estado;
	String carnet_c;
	String f_caducidad;
	String f_emision;
	int id_curso;
	int id_persona;
	
	public CursoConductor(int id_curso_conductor, String f_inicio, String f_fin, String estado, String carnet_c,
			String f_caducidad, String f_emision, int id_curso, int id_persona) {
		super();
		this.id_curso_conductor = id_curso_conductor;
		this.f_inicio = f_inicio;
		this.f_fin = f_fin;
		this.estado = estado;
		this.carnet_c = carnet_c;
		this.f_caducidad = f_caducidad;
		this.f_emision = f_emision;
		this.id_curso = id_curso;
		this.id_persona = id_persona;
	}

	public int getId_curso_conductor() {
		return id_curso_conductor;
	}

	public void setId_curso_conductor(int id_curso_conductor) {
		this.id_curso_conductor = id_curso_conductor;
	}

	public String getF_inicio() {
		return f_inicio;
	}

	public void setF_inicio(String f_inicio) {
		this.f_inicio = f_inicio;
	}

	public String getF_fin() {
		return f_fin;
	}

	public void setF_fin(String f_fin) {
		this.f_fin = f_fin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCarnet_c() {
		return carnet_c;
	}

	public void setCarnet_c(String carnet_c) {
		this.carnet_c = carnet_c;
	}

	public String getF_caducidad() {
		return f_caducidad;
	}

	public void setF_caducidad(String f_caducidad) {
		this.f_caducidad = f_caducidad;
	}

	public String getF_emision() {
		return f_emision;
	}

	public void setF_emision(String f_emision) {
		this.f_emision = f_emision;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	
	
}
