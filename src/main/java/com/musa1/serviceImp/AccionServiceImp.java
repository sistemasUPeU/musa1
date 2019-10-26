package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.AccionDao;
import com.musa1.entity.Accion;
import com.musa1.service.AccionService;

@Service
public class AccionServiceImp implements AccionService {
	@Autowired
	private AccionDao accionDao;
	
	@Override
	public int create(Accion accion) {
		// TODO Auto-generated method stub
		return accionDao.create(accion);
	}

	@Override
	public int update(Accion accion) {
		// TODO Auto-generated method stub
		return accionDao.update(accion);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return accionDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return accionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return accionDao.readAll();
	}

}
