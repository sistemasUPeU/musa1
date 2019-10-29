package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.TipoAccionDao;
import com.musa1.entity.TipoAccion;
import com.musa1.service.TipoAccionService;
@Service
public class TipoAccionServiceImp implements TipoAccionService {
	@Autowired
	private TipoAccionDao tipo_accionDao;
	@Override
	public int create(TipoAccion tipo_accion) {
		// TODO Auto-generated method stub
		return tipo_accionDao.create(tipo_accion);
	}

	@Override
	public int update(TipoAccion tipo_accion) {
		// TODO Auto-generated method stub
		return tipo_accionDao.update(tipo_accion);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_accionDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipo_accionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipo_accionDao.readAll();
	}

}
