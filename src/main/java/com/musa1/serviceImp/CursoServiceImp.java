package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.CursoDao;
import com.musa1.entity.Curso;
import com.musa1.service.CursoService;

@Service
public class CursoServiceImp implements CursoService {
	@Autowired
	private CursoDao cursoDao;

	@Override
	public int create(Curso curso) {
		// TODO Auto-generated method stub
		return cursoDao.create(curso);
	}

	@Override
	public int edit(Curso curso) {
		// TODO Auto-generated method stub
		return cursoDao.edit(curso);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cursoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return cursoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return cursoDao.readAll();
	}
	
	
}
