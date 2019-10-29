package com.musa1.entity;

import java.sql.Date;

public class RevisionTecnica {
	int id_revision_tecnica;
	Date fecha;
	String nro_certificado;
	String empresa_de_revision;
	String resultado_inspeccion;
	String vigencia_certificado;
	String url;
	String observacion;
	int id_bus;
	int id_persona;
	char nota;
	public RevisionTecnica(int id_revision_tecnica, Date fecha, String nro_certificado, String empresa_de_revision,
			String resultado_inspeccion, String vigencia_certificado, String url, String observacion, int id_bus,
			int id_persona, char nota) {
		super();
		this.id_revision_tecnica = id_revision_tecnica;
		this.fecha = fecha;
		this.nro_certificado = nro_certificado;
		this.empresa_de_revision = empresa_de_revision;
		this.resultado_inspeccion = resultado_inspeccion;
		this.vigencia_certificado = vigencia_certificado;
		this.url = url;
		this.observacion = observacion;
		this.id_bus = id_bus;
		this.id_persona = id_persona;
		this.nota = nota;
	}
	public int getId_revision_tecnica() {
		return id_revision_tecnica;
	}
	public void setId_revision_tecnica(int id_revision_tecnica) {
		this.id_revision_tecnica = id_revision_tecnica;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNro_certificado() {
		return nro_certificado;
	}
	public void setNro_certificado(String nro_certificado) {
		this.nro_certificado = nro_certificado;
	}
	public String getEmpresa_de_revision() {
		return empresa_de_revision;
	}
	public void setEmpresa_de_revision(String empresa_de_revision) {
		this.empresa_de_revision = empresa_de_revision;
	}
	public String getResultado_inspeccion() {
		return resultado_inspeccion;
	}
	public void setResultado_inspeccion(String resultado_inspeccion) {
		this.resultado_inspeccion = resultado_inspeccion;
	}
	public String getVigencia_certificado() {
		return vigencia_certificado;
	}
	public void setVigencia_certificado(String vigencia_certificado) {
		this.vigencia_certificado = vigencia_certificado;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getId_bus() {
		return id_bus;
	}
	public void setId_bus(int id_bus) {
		this.id_bus = id_bus;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public char getNota() {
		return nota;
	}
	public void setNota(char nota) {
		this.nota = nota;
	}
	
	
}
