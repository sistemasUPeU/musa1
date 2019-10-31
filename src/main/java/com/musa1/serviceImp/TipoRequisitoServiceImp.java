package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.TipoRequisitoDao;
import com.musa1.entity.TipoRequisito;
import com.musa1.service.TipoRequisitoService;

@Service
public class TipoRequisitoServiceImp implements TipoRequisitoService{
	@Autowired
	private TipoRequisitoDao tipoRequisitoDao;
	
	@Override
	public int create(TipoRequisito tipoRequisito) {
		// TODO Auto-generated method stub
		return tipoRequisitoDao.create(tipoRequisito);
	}

	@Override
	public int edit(TipoRequisito tipoRequisito) {
		// TODO Auto-generated method stub
		return tipoRequisitoDao.edit(tipoRequisito);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipoRequisitoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipoRequisitoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipoRequisitoDao.readAll();
	}

}
