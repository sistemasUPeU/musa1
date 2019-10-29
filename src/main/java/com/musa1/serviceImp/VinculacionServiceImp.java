package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.VinculacionDao;
import com.musa1.entity.Vinculacion;
import com.musa1.service.VinculacionService;

@Service
public class VinculacionServiceImp implements VinculacionService{
	
	@Autowired
	private VinculacionDao dao;
	@Override
	public Map<String, Object> crearVinculacion(Vinculacion e) {
		return dao.crearVinculacion(e);
	}
	@Override
	public Map<String, Object> listarVistaVinculacionBus() {
		return dao.listarVistaVinculacionBus();
	}

}

