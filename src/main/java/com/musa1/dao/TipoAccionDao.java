package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.TipoAccion;

public interface TipoAccionDao {
	public int create(TipoAccion tipo_accion);
	public int update(TipoAccion tipo_accion);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();

}
