package com.musa1.service;

import java.util.Map;
import com.musa1.entity.Mantenimiento;

public interface MantenimientoService {
	public int create(Mantenimiento mantenimiento);
	public int update(Mantenimiento mantenimiento);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}