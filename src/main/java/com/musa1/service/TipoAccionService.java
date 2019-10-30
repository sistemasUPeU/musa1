package com.musa1.service;

import java.util.Map;

import com.musa1.entity.TipoAccion;

public interface TipoAccionService {
	public int create(TipoAccion tipo_accion);
	public int update(TipoAccion tipo_accion);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
