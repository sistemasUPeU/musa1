package com.musa1.service;

import java.util.Map;

import com.musa1.entity.AsignarBus;


public interface AsignarBusService {

	public Map<String, Object> readAsignarBus();
	public Map<String, Object> readParadero();
	public int edit(AsignarBus ab);

	Map<String , Object> readfil(int nume);


}
