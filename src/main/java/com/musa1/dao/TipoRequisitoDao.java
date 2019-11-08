package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Requisito;
import com.musa1.entity.TipoRequisito;

public interface TipoRequisitoDao {
	public int create (TipoRequisito tipoRequisito);
	public int edit (TipoRequisito tipoRequisito);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> ListarTipoRequisitosBus();
}
