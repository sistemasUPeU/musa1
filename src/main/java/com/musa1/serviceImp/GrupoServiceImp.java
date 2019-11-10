package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.GrupoDao;
import com.musa1.entity.Grupo;
import com.musa1.service.GrupoService;

@Service
public class GrupoServiceImp implements GrupoService {
	
	@Autowired 
	private GrupoDao grupoDao;
		
	@Override
	public int create(Grupo grupo) {
		// TODO Auto-generated method stub
		return grupoDao.create(grupo);
	}

	@Override
	public int update(int estado) {
		// TODO Auto-generated method stub
		return grupoDao.update(estado);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return grupoDao.delete(id);
	}

	@Override
	public Map<String, Object> readAll(int tipo) {
		// TODO Auto-generated method stub
		return grupoDao.readAll(tipo);
	}

}
