package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Curso;
import com.musa1.entity.Vinculacion;

public interface VinculacionService {
	public Map<String, Object> crearVinculacion(Vinculacion e);
	public Map<String, Object> listarVistaVinculacionBus();
}
