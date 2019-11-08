package com.musa1.service;

import java.util.Map;

import com.musa1.entity.TipoRequisito;

public interface TipoRequisitoService {
	public int create (TipoRequisito tipoRequisito);
	public int edit (TipoRequisito tipoRequisito);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
