package com.musa1.entity;

public class TipoRequisito {
	private int id_tipo_requisito;
	private String tipo_requisito;
	private String estado;
	public TipoRequisito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoRequisito(int id_tipo_requisito, String tipo_requisito, String estado) {
		super();
		this.id_tipo_requisito = id_tipo_requisito;
		this.tipo_requisito = tipo_requisito;
		this.estado = estado;
	}
	public int getId_tipo_requisito() {
		return id_tipo_requisito;
	}
	public void setId_tipo_requisito(int id_tipo_requisito) {
		this.id_tipo_requisito = id_tipo_requisito;
	}
	public String getTipo_requisito() {
		return tipo_requisito;
	}
	public void setTipo_requisito(String tipo_requisito) {
		this.tipo_requisito = tipo_requisito;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
