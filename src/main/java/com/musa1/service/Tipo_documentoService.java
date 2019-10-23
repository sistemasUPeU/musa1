package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Tipo_documento;

public interface Tipo_documentoService {
	public int create (Tipo_documento tipo_documento);
	public int edit (Tipo_documento tipo_documento);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
