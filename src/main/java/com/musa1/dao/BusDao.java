package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Bus;

public interface BusDao {
	public int create(Bus b);
	public int update(Bus b);
	public int delete(int id);
	public Map<String, Object> read(String placa);
	public Map<String, Object> readAll();
}
