package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.VinculacionRequisitoDao;
import com.musa1.entity.VinculacionRequisito;
import com.musa1.service.VinculacionRequisitoService;

@Service
public class VinculacionRequisitoServiceImp implements VinculacionRequisitoService{
	
	@Autowired
	private VinculacionRequisitoDao vinculacionRequisitoDao;
	@Override
	public int CrearRequisitoBus(VinculacionRequisito e, int id_v) {
		e.setId_vinculacion(id_v);
		return vinculacionRequisitoDao.CrearRequisitoBus(e);
	}
	@Override
	public Map<String, Object> ListarVinculacionRequisito(int idv) {
		return vinculacionRequisitoDao.ListarVinculacionRequisito(idv);
	}
	@Override
	public int modificarVinculacionRequisito(VinculacionRequisito e) {
		return vinculacionRequisitoDao.modificarVinculacionRequisito(e);
	}

}
