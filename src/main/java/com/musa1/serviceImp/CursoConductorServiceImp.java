package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.CursoConductorDao;
import com.musa1.entity.CursoConductor;
import com.musa1.service.CursoConductorService;

@Service
public class CursoConductorServiceImp implements CursoConductorService{
	@Autowired
	private CursoConductorDao cursoConductorDao;
	
	@Override
	public int create(CursoConductor cursoConductor) {
		// TODO Auto-generated method stub
		return cursoConductorDao.create(cursoConductor);
	}

	@Override
	public int update(CursoConductor cursoConductor) {
		// TODO Auto-generated method stub
		return cursoConductorDao.update(cursoConductor);
	}

	@Override
	public Map<String, Object> searchCursoConductor(String nombre) {
		// TODO Auto-generated method stub
		return cursoConductorDao.searchCursoConductor(nombre);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return cursoConductorDao.readAll();
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return cursoConductorDao.read(id);
	}

}
