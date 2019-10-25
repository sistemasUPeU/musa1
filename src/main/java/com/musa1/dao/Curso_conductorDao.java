package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Curso_conductor;

public interface Curso_conductorDao {
	public int create (Curso_conductor curso_conductor);
	public int update (Curso_conductor curso_conductor);
	public Map<String , Object> searchCurso_conductor(String nombre);
	public Map<String , Object> readAll();
}
