package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Accion;

public interface AccionService {
	public int create(Accion accion);
	public int update(Accion accion);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();

}
