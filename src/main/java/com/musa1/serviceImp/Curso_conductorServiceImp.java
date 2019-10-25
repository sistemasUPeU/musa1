package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.Curso_conductorDao;
import com.musa1.entity.Curso_conductor;
import com.musa1.service.Curso_conductorService;

@Service
public class Curso_conductorServiceImp implements Curso_conductorService{
	@Autowired
	private Curso_conductorDao curso_conductorDao;
	
	@Override
	public int create(Curso_conductor curso_conductor) {
		// TODO Auto-generated method stub
		return curso_conductorDao.create(curso_conductor);
	}

	@Override
	public int update(Curso_conductor curso_conductor) {
		// TODO Auto-generated method stub
		return curso_conductorDao.update(curso_conductor);
	}

	@Override
	public Map<String, Object> searchCurso_conductor(String nombre) {
		// TODO Auto-generated method stub
		return curso_conductorDao.searchCurso_conductor(nombre);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return curso_conductorDao.readAll();
	}

}
