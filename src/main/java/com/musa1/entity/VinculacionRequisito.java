package com.musa1.entity;

import java.util.Date;

public class VinculacionRequisito {
	private int id_vinculacion_requisito;
	private String url;
	private int estado;
	private Date fecha_vencimiento_doc;
	private int id_requisito;
	private int id_vinculacion;
	private int id_curso_conductor;
	public VinculacionRequisito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VinculacionRequisito(int id_vinculacion_requisito, String url, int estado, Date fecha_vencimiento_doc,
			int id_requisito, int id_vinculacion, int id_curso_conductor) {
		super();
		this.id_vinculacion_requisito = id_vinculacion_requisito;
		this.url = url;
		this.estado = estado;
		this.fecha_vencimiento_doc = fecha_vencimiento_doc;
		this.id_requisito = id_requisito;
		this.id_vinculacion = id_vinculacion;
		this.id_curso_conductor = id_curso_conductor;
	}
	public int getId_vinculacion_requisito() {
		return id_vinculacion_requisito;
	}
	public void setId_vinculacion_requisito(int id_vinculacion_requisito) {
		this.id_vinculacion_requisito = id_vinculacion_requisito;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFecha_vencimiento_doc() {
		return fecha_vencimiento_doc;
	}
	public void setFecha_vencimiento_doc(Date fecha_vencimiento_doc) {
		this.fecha_vencimiento_doc = fecha_vencimiento_doc;
	}
	public int getId_requisito() {
		return id_requisito;
	}
	public void setId_requisito(int id_requisito) {
		this.id_requisito = id_requisito;
	}
	public int getId_vinculacion() {
		return id_vinculacion;
	}
	public void setId_vinculacion(int id_vinculacion) {
		this.id_vinculacion = id_vinculacion;
	}
	public int getId_curso_conductor() {
		return id_curso_conductor;
	}
	public void setId_curso_conductor(int id_curso_conductor) {
		this.id_curso_conductor = id_curso_conductor;
	}
	
}
