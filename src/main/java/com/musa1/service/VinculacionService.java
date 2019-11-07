package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Curso;
import com.musa1.entity.Vinculacion;

public interface VinculacionService {
	public int eliminarVinculacionBus(String placa);
	public Map<String, Object> createVinculacionConductor(Vinculacion vinculacion);
	public Map<String, Object> readVinculacionConductor();
	public Map<String, Object> crearVinculacionBus(Vinculacion e);
	public Map<String, Object> listarVistaVinculacionBus();
	public Map<String, Object> listarVinculacionBusPlaca(String placa);
	public Map<String, Object>listarInvolubradosBus(String placa);
}
