package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.RolDao;
import com.musa1.entity.OpcionRol;
import com.musa1.entity.Rol;
import com.musa1.service.RolService;

@Service
public class RolServiceImp implements RolService {
	@Autowired
	private RolDao rolDao;
	@Override
	public int create(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.create(rol);
	}

	@Override
	public int addOpcionRol(OpcionRol opcionRol) {
		// TODO Auto-generated method stub
		return rolDao.addOpcionRol(opcionRol);
	}

	@Override
	public int edit(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.edit(rol);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rolDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

}
