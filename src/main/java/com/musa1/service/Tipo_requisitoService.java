package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Tipo_requisito;

public interface Tipo_requisitoService {
	public int create (Tipo_requisito tipo_requisito);
	public int edit (Tipo_requisito tipo_requisito);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
