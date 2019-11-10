package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Grupo;

public interface GrupoDao {
	public int create(Grupo g);
	public int update(int estado);
	public int delete (int id);
	Map<String, Object> readAll(int tipo);
}
