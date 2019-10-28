package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Bus;

public interface BusService {
	public int create(Bus b);
	public int update(Bus b);
	public int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
