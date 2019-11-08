package com.musa1.service;

import java.util.Map;

import com.musa1.entity.DetalleMantenimiento;

public interface DetalleMantenimientoService {
	public int create(DetalleMantenimiento detallemantenimiento);
	public int update(DetalleMantenimiento detallemantenimiento);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
