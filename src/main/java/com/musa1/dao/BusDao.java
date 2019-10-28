package com.musa1.dao;

import java.util.List;
import java.util.Map;

import com.musa1.entity.Bus;

public interface BusDao {
	public int create(Bus b);
	public int update(Bus b);
	public int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
