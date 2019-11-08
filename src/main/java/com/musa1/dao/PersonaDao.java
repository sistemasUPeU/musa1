package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Persona;

public interface PersonaDao {
	public int create (Persona persona);
	public int edit(Persona persona);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String , Object> searchPersona(String nombre);
	public Map<String, Object> readAll();
}
