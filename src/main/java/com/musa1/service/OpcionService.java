package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Opcion;
import com.musa1.entity.OpcionUsuario;

public interface OpcionService {
	public Map<String, Object> create(Opcion opcion);
	public int addUsuarioOpcion(OpcionUsuario opcionUsuario);
	public int edit(Opcion opcion);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
