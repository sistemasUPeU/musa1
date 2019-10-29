package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Tipo_vinculacion;

public interface Tipo_vinculacionService {
	public int create (Tipo_vinculacion tipo_vinculacion);
	public int update (Tipo_vinculacion tipo_vinculacion);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
