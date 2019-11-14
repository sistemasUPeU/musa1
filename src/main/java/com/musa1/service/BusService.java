package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Bus;
import com.musa1.entity.VinculacionRequisito;

public interface BusService {
	public int create(Bus b);
	public int update(Bus b);
	public int delete(int id);
	public Map<String, Object> read(String placa);
	public Map<String, Object> readAll();
	public int createVin(VinculacionRequisito vr);
}
