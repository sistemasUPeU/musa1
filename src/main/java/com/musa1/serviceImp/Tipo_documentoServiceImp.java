package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.Tipo_documentoDao;
import com.musa1.entity.Tipo_documento;
import com.musa1.service.Tipo_documentoService;

@Service
public class Tipo_documentoServiceImp implements Tipo_documentoService {
	@Autowired
	private Tipo_documentoDao tipo_documentoDao;
	
	@Override
	public int create(Tipo_documento tipo_documento) {
		// TODO Auto-generated method stub
		return tipo_documentoDao.create(tipo_documento);
	}

	@Override
	public int edit(Tipo_documento tipo_documento) {
		// TODO Auto-generated method stub
		return tipo_documentoDao.edit(tipo_documento);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_documentoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipo_documentoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipo_documentoDao.readAll();
	}

}
