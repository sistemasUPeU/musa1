package com.musa1.service;

import java.util.Map;

import com.musa1.entity.VinculacionRequisito;

public interface VinculacionRequisitoService {
	public int createRequisitoConductor(VinculacionRequisito vinculacionRequisito, int id);
	public Map<String, Object> readVinculacionRequisitoConductor(int id);
	public int CrearRequisitoBus(VinculacionRequisito  e, int id_v);
	public int modificarVinculacionRequisito(VinculacionRequisito e);
	public Map<String, Object> ListarVinculacionRequisito(int idv);
	public int modificarVrequisitoBus(VinculacionRequisito e);
}
