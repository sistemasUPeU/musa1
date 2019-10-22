package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Persona;

public interface PersonaService {
	public int create (Persona persona);
	public int edit(Persona persona);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
