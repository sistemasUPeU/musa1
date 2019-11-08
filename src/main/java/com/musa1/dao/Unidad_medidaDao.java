package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Unidad_medida;

public interface Unidad_medidaDao {
	public int create (Unidad_medida unidad_medida);
	public int edit(Unidad_medida unidad_medida);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String , Object> readAll();
}	
