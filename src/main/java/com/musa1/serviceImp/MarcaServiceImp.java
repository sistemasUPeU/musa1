package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.MarcaDao;
import com.musa1.entity.Marca;
import com.musa1.service.MarcaService;

@Service
public class MarcaServiceImp implements MarcaService{
	@Autowired
	private MarcaDao marcaDao;
	@Override
	public int create(Marca m) {
		// TODO Auto-generated method stub
		return marcaDao.create(m);
	}

	@Override
	public int update(Marca m) {
		// TODO Auto-generated method stub
		return marcaDao.update(m);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return marcaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return marcaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return marcaDao.readAll();
	}

}
