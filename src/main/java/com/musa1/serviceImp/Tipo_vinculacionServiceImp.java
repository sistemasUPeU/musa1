package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.Tipo_vinculacionDao;
import com.musa1.entity.Tipo_vinculacion;
import com.musa1.service.Tipo_vinculacionService;

@Service
public class Tipo_vinculacionServiceImp implements Tipo_vinculacionService{
	@Autowired
	private Tipo_vinculacionDao tipo_vinculacionDao;
	
	@Override
	public int create(Tipo_vinculacion tipo_vinculacion) {
		// TODO Auto-generated method stub
		return tipo_vinculacionDao.create(tipo_vinculacion);
	}

	@Override
	public int update(Tipo_vinculacion tipo_vinculacion) {
		// TODO Auto-generated method stub
		return tipo_vinculacionDao.update(tipo_vinculacion);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_vinculacionDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipo_vinculacionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipo_vinculacionDao.readAll();
	}
	
}
