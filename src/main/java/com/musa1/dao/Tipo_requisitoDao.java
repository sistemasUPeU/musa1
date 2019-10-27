package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Tipo_requisito;

public interface Tipo_requisitoDao {
	public int create (Tipo_requisito tipo_requisito);
	public int edit (Tipo_requisito tipo_requisito);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
