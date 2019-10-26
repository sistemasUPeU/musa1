package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Empresa;

public interface EmpresaService {
	public int create(Empresa empresa);
	public int update(Empresa empresa);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();

}
