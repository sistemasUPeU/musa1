package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Curso;

public interface CursoService {
	public int create (Curso curso);
	public int edit(Curso curso);
	public int delete(int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
}
