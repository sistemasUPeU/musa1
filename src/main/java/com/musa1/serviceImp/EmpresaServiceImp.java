package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.EmpresaDao;
import com.musa1.entity.Empresa;
import com.musa1.service.EmpresaService;

@Service
public class EmpresaServiceImp implements EmpresaService {
	@Autowired
	private EmpresaDao empresaDao;

	@Override
	public int create(Empresa empresa) {
		// TODO Auto-generated method stub
		return empresaDao.create(empresa);
	}

	@Override
	public int update(Empresa empresa) {
		// TODO Auto-generated method stub
		return empresaDao.update(empresa);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return empresaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return empresaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return empresaDao.readAll();
	}

}
