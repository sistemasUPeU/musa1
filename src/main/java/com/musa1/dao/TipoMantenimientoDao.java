package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.TipoMantenimiento;

public interface TipoMantenimientoDao {
	public int create (TipoMantenimiento tipomantenimiento);
	public int edit (TipoMantenimiento tipomantenimiento);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();

}
