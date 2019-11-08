package com.musa1.service;

import java.util.Map;

import com.musa1.entity.TipoVinculacion;

public interface TipoVinculacionService {
	public int create (TipoVinculacion tipoVinculacion);
	public int update (TipoVinculacion tipoVinculacion);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
