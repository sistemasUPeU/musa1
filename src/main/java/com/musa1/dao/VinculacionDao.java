package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Vinculacion;

public interface VinculacionDao {
	public Map<String, Object> createVinculacionConductor(Vinculacion vinculacion);
	public Map<String, Object> readVinculacionConductor();
	public Map<String, Object> crearVinculacionBus(Vinculacion e);
	public Map<String, Object> listarVistaVinculacionBus();
}
