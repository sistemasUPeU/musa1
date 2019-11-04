package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Categoria;

public interface CategoriaDao {
	public int create(Categoria categoria);
	public int update(Categoria categoria);
	public int delete(int id);
	Map<String, Object> readAll();
}
