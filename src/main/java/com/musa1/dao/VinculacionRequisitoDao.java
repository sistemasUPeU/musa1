package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Requisito;
import com.musa1.entity.VinculacionRequisito;

public interface VinculacionRequisitoDao {
	public int CrearRequisitoBus(VinculacionRequisito  e);
	public int modificarVinculacionRequisito(VinculacionRequisito e);
	public Map<String, Object> ListarVinculacionRequisito(int idv);
}
