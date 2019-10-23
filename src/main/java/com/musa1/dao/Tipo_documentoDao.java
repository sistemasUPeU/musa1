package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Tipo_documento;

public interface Tipo_documentoDao {
	public int create (Tipo_documento tipo_documento);
	public int edit (Tipo_documento tipo_documento);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
