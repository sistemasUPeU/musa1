package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Requisito;
import com.musa1.entity.VinculacionRequisito;

public interface VinculacionRequisitoDao {
	public int createRequisitoConductor(VinculacionRequisito vinculacionRequisito);
	public Map<String, Object> readVinculacionRequisitoConductor(int id);
	public int CrearRequisitoBus(VinculacionRequisito  e);
	public Map<String, Object> ListarVinculacionRequisito(int idv);
}
