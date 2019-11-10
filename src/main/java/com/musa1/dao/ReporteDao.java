package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Reporte;

public interface ReporteDao {
	public int create(Reporte reporte);
	public int edit(Reporte reporte);
	public int delete(int id);
	public Map<String , Object> read(int id);
	public Map<String , Object> readAll();
}
