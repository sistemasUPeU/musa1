package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Vinculacion;

public interface VinculacionDao {
	public int create(Vinculacion e);
	public int update(Vinculacion e);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
