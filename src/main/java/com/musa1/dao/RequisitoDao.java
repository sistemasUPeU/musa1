package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Requisito;

public interface RequisitoDao {
	public int create (Requisito requisito);
	public int update (Requisito requisito);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> readRequisitoConductor();
	public Map<String, Object> listarRequisitosBus();
}
