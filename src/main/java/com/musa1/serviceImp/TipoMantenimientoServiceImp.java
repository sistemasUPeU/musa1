package com.musa1.serviceImp;

import java.util.Map;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.musa1.dao.TipoMantenimientoDao;
import com.musa1.entity.TipoMantenimiento;
import com.musa1.service.TipoMantenimientoService;
@Service
public class TipoMantenimientoServiceImp implements TipoMantenimientoService{
	@Autowired
	private TipoMantenimientoDao tipomantenimientoDao;
	
	@Override
	public int create(TipoMantenimiento tipomantenimiento) {
		// TODO Auto-generated method stub
		return tipomantenimientoDao.create(tipomantenimiento);
	}

	@Override
	public int edit(TipoMantenimiento tipomantenimiento) {
		// TODO Auto-generated method stub
		return tipomantenimientoDao.edit(tipomantenimiento);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipomantenimientoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipomantenimientoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipomantenimientoDao.readAll();
	}
}
