package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Vinculacion;

public interface VinculacionDao {
	public int eliminarVinculacionBus(String placa);
	public Map<String, Object> createVinculacionConductor(Vinculacion vinculacion);
	public Map<String, Object> readVinculacionConductor();
	public Map<String, Object> crearVinculacionBus(Vinculacion e);
	public Map<String, Object> listarVistaVinculacionBus();
	public Map<String, Object> listarVinculacionBusPlaca(String placa);
	public Map<String, Object> listarVinculacionBusId(int id);
	public Map<String, Object>listarInvolubradosBus(String placa);
	public int modificarVinculacionBus(Vinculacion e);
}
