package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Producto;

public interface ProductoService {
	public int create (Producto producto);
	public int edit(Producto producto);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> consreadAll();
	
}
