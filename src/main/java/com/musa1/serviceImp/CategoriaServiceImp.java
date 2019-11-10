package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.CategoriaDao;
import com.musa1.entity.Categoria;
import com.musa1.service.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
	@Autowired
	private CategoriaDao categoriaDao;
	@Override
	public int create(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaDao.create(c);
	}

	@Override
	public int update(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaDao.update(c);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return categoriaDao.delete(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return categoriaDao.readAll();
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return categoriaDao.read(id);
	}

}