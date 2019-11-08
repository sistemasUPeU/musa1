package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.TipoVinculacion;

public interface TipoVinculacionDao {
	public int create (TipoVinculacion tipoVinculacion);
	public int update (TipoVinculacion tipoVinculacion);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
