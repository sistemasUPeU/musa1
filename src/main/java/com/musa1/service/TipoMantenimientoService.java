package com.musa1.service;

import java.util.Map;

import com.musa1.entity.TipoMantenimiento;

public interface TipoMantenimientoService {
	public int create(TipoMantenimiento tipomantenimiento);
	public int edit(TipoMantenimiento tipomantenimiento);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}

