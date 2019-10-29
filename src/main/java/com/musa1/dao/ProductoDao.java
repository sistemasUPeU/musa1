package com.musa1.dao;

import java.util.Map;


import com.musa1.entity.Producto;

public interface ProductoDao {
	public int create (Producto producto);
	public int edit(Producto producto);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	
}
