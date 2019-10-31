package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.CursoConductor;

public interface CursoConductorDao {
	public int create (CursoConductor cursoConductor);
	public int update (CursoConductor cursoConductor);
	public Map<String , Object> searchCursoConductor(String nombre);
	public Map<String , Object> readAll();
}
