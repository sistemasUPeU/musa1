package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.Tipo_accionDao;
import com.musa1.entity.Tipo_accion;
import com.musa1.service.Tipo_accionService;
@Service
public class Tipo_accionServiceImp implements Tipo_accionService {
	@Autowired
	private Tipo_accionDao tipo_accionDao;
	@Override
	public int create(Tipo_accion tipo_accion) {
		// TODO Auto-generated method stub
		return tipo_accionDao.create(tipo_accion);
	}

	@Override
	public int update(Tipo_accion tipo_accion) {
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
