package com.musa1.entity;

public class Curso {
	int id_curso;
	String nombre_curso;
	String tiempo_vigencia;
	String estado;
	public Curso(int id_curso, String nombre_curso, String tiempo_vigencia, String estado) {
		super();
		this.id_curso = id_curso;
		this.nombre_curso = nombre_curso;
		this.tiempo_vigencia = tiempo_vigencia;
		this.estado = estado;
	}
	public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public String getNombre_curso() {
		return nombre_curso;
	}
	public void setNombre_curso(String nombre_curso) {
		this.nombre_curso = nombre_curso;
	}
	public String getTiempo_vigencia() {
		return tiempo_vigencia;
	}
	public void setTiempo_vigencia(String tiempo_vigencia) {
		this.tiempo_vigencia = tiempo_vigencia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
