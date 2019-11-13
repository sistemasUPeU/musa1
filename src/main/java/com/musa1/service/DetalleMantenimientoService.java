package com.musa1.service;

import java.util.Map;

import com.musa1.entity.DetalleMantenimiento;

public interface DetalleMantenimientoService {
	public int create(DetalleMantenimiento detallemantenimiento);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> read_detalle_ojito_mant(int id);
	public int update_accion(DetalleMantenimiento detallemantenimiento);
	public Map<String, Object> read_detalle_mant(int id);
}
