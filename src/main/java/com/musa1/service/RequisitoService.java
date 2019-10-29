package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Requisito;
import com.musa1.entity.VinculacionRequisito;

public interface RequisitoService {
	public int create (Requisito requisito);
	public int update (Requisito requisito);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> readRequisitoConductor();
	public Map<String, Object> ListarRequisitoBus();
}
