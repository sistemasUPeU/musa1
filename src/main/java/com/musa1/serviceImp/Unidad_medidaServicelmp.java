package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.Unidad_medidaDao;
import com.musa1.entity.Unidad_medida;
import com.musa1.service.Unidad_medidaService;

@Service
public class Unidad_medidaServicelmp implements Unidad_medidaService {

	@Autowired
	private Unidad_medidaDao unidad_medidaDao;

	@Override
	public int create(Unidad_medida unidad_medida) {
		// TODO Auto-generated method stub
		return unidad_medidaDao.create(unidad_medida);
	}

	@Override
	public int edit(Unidad_medida unidad_medida) {
		// TODO Auto-generated method stub
		return unidad_medidaDao.edit(unidad_medida);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return unidad_medidaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return unidad_medidaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return unidad_medidaDao.readAll();
	}
	
	
}
