package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.AsignarBus;

public interface AsignarBusDao {

	public Map<String, Object> readAsignarBus();
	
	public Map<String, Object> readParadero();

	public int edit(AsignarBus ab);
	

	Map<String , Object> readfil(int nume);


}