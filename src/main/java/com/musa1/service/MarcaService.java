package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Marca;

public interface MarcaService {
	public int create(Marca m);
	public int update(Marca m);
	public int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
