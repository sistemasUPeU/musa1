package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Categoria;

public interface CategoriaService {
	public int create(Categoria categoria);
	public int update(Categoria categoria);
	public int delete(int id);
	Map<String, Object> readAll();
}
