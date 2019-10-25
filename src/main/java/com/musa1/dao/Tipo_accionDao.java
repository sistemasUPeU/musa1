package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Tipo_accion;

public interface Tipo_accionDao {
	public int create(Tipo_accion tipo_accion);
	public int update(Tipo_accion tipo_accion);
	public int delete(int id);
	public Map<String , Object> read(int id);
	public Map<String , Object> readAll();

}
