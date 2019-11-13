package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.OpcionDao;
import com.musa1.entity.Opcion;
import com.musa1.entity.OpcionUsuario;
import com.musa1.service.OpcionService;

@Service
public class OpcionServiceImp implements OpcionService {
	@Autowired
	private OpcionDao opcionDao;
	
	@Override
	public Map<String, Object> create(Opcion opcion) {
		// TODO Auto-generated method stub
		return opcionDao.create(opcion);
	}

	@Override
	public int addUsuarioOpcion(OpcionUsuario opcionUsuario) {
		// TODO Auto-generated method stub
		return opcionDao.addUsuarioOpcion(opcionUsuario);
	}

	@Override
	public int edit(Opcion opcion) {
		// TODO Auto-generated method stub
		return opcionDao.edit(opcion);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return opcionDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return opcionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return opcionDao.readAll();
	}

}
