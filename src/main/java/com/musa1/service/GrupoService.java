package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Grupo;

public interface GrupoService {
	public int create (Grupo grupo);
	public int update ( int estado);
	public int delete (int id );
	public Map<String, Object> readAll( int tipo);
}
