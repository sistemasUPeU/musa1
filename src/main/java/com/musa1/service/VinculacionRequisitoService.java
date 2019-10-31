package com.musa1.service;

import java.util.Map;

import com.musa1.entity.VinculacionRequisito;

public interface VinculacionRequisitoService {
	public int CrearRequisitoBus(VinculacionRequisito  e, int id_v);
	public Map<String, Object> ListarVinculacionRequisito(int idv);
}
