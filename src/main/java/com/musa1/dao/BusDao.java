package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Bus;
import com.musa1.entity.VinculacionRequisito;

public interface BusDao {
	public int create(Bus b);
	public int update(Bus b);
	public int delete(int b);
	public Map<String, Object> read(String placa);
	public Map<String, Object> readAll();
	public int createVin(VinculacionRequisito vr);
	public Map<String, Object> read2();
	public Map<String, Object> STC();
	public int delete2(int vr);
}
