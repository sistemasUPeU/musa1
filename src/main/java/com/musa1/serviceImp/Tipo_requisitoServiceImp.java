package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.Tipo_requisitoDao;
import com.musa1.entity.Tipo_requisito;
import com.musa1.service.Tipo_requisitoService;

@Service
public class Tipo_requisitoServiceImp implements Tipo_requisitoService{
	@Autowired
	private Tipo_requisitoDao tipo_requisitoDao;
	
	@Override
	public int create(Tipo_requisito tipo_requisito) {
		// TODO Auto-generated method stub
		return tipo_requisitoDao.create(tipo_requisito);
	}

	@Override
	public int edit(Tipo_requisito tipo_requisito) {
		// TODO Auto-generated method stub
		return tipo_requisitoDao.edit(tipo_requisito);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_requisitoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipo_requisitoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipo_requisitoDao.readAll();
	}

}
