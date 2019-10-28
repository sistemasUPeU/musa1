package com.musa1.entity;

public class Bus {
	int idbus;
	int id_persona_propietario;
	String marca;
	String placa;
	String descripcion;
	String padron;
	String estado;
	String modelo;
	int nro_motor;
	String año_fabricacion;
	String nro_serie;
	int nro_asientos;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int idbus, int id_persona_propietario, String marca, String placa, String descripcion, String padron,
			String estado, String modelo, int nro_motor, String año_fabricacion, String nro_serie, int nro_asientos) {
		super();
		this.idbus = idbus;
		this.id_persona_propietario = id_persona_propietario;
		this.marca = marca;
		this.placa = placa;
		this.descripcion = descripcion;
		this.padron = padron;
		this.estado = estado;
		this.modelo = modelo;
		this.nro_motor = nro_motor;
		this.año_fabricacion = año_fabricacion;
		this.nro_serie = nro_serie;
		this.nro_asientos = nro_asientos;
	}
	public int getIdbus() {
		return idbus;
	}
	public void setIdbus(int idbus) {
		this.idbus = idbus;
	}
	public int getId_persona_propietario() {
		return id_persona_propietario;
	}
	public void setId_persona_propietario(int id_persona_propietario) {
		this.id_persona_propietario = id_persona_propietario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPadron() {
		return padron;
	}
	public void setPadron(String padron) {
		this.padron = padron;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNro_motor() {
		return nro_motor;
	}
	public void setNro_motor(int nro_motor) {
		this.nro_motor = nro_motor;
	}
	public String getAño_fabricacion() {
		return año_fabricacion;
	}
	public void setAño_fabricacion(String año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}
	public String getNro_serie() {
		return nro_serie;
	}
	public void setNro_serie(String nro_serie) {
		this.nro_serie = nro_serie;
	}
	public int getNro_asientos() {
		return nro_asientos;
	}
	public void setNro_asientos(int nro_asientos) {
		this.nro_asientos = nro_asientos;
	}
	
}