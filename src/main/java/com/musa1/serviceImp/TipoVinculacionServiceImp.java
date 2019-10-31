package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.TipoVinculacionDao;
import com.musa1.entity.TipoVinculacion;
import com.musa1.service.TipoVinculacionService;

@Service
public class TipoVinculacionServiceImp implements TipoVinculacionService{
	@Autowired
	private TipoVinculacionDao tipoVinculacionDao;
	
	@Override
	public int create(TipoVinculacion tipoVinculacion) {
		// TODO Auto-generated method stub
		return tipoVinculacionDao.create(tipoVinculacion);
	}

	@Override
	public int update(TipoVinculacion tipoVinculacion) {
		// TODO Auto-generated method stub
		return tipoVinculacionDao.update(tipoVinculacion);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipoVinculacionDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipoVinculacionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipoVinculacionDao.readAll();
	}
	
}
