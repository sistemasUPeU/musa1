package com.musa1.entity;

public class Bus {
	private int id_bus;
	private String marca;
	private String placa;
	private String descripcion;
	private String padron;
	private String estado;
	private String modelo;
	private int nro_motor;
	private int año_fabricacion;
	private int nro_serie;
	private int nro_asientos;
	private int id_persona_propietario;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int id_bus, String marca, String placa, String descripcion, String padron, String estado, String modelo,
			int nro_motor, int año_fabricacion, int nro_serie, int nro_asientos, int id_persona_propietario) {
		super();
		this.id_bus = id_bus;
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
		this.id_persona_propietario = id_persona_propietario;
	}
	public int getId_bus() {
		return id_bus;
	}
	public void setId_bus(int id_bus) {
		this.id_bus = id_bus;
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
	public int getAño_fabricacion() {
		return año_fabricacion;
	}
	public void setAño_fabricacion(int año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}
	public int getNro_serie() {
		return nro_serie;
	}
	public void setNro_serie(int nro_serie) {
		this.nro_serie = nro_serie;
	}
	public int getNro_asientos() {
		return nro_asientos;
	}
	public void setNro_asientos(int nro_asientos) {
		this.nro_asientos = nro_asientos;
	}
	public int getId_persona_propietario() {
		return id_persona_propietario;
	}
	public void setId_persona_propietario(int id_persona_propietario) {
		this.id_persona_propietario = id_persona_propietario;
	}
}
