package com.musa1.serviceImp;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.MantenimientoDao;
import com.musa1.entity.Mantenimiento;
import com.musa1.service.MantenimientoService;


@Service
public class MantenimientoServiceImp implements MantenimientoService{
	@Autowired
	private MantenimientoDao mantenimientoDao;
	
	@Override
	public int create(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		return mantenimientoDao.create(mantenimiento);
	}
	
	@Override
	public int update(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		return mantenimientoDao.update(mantenimiento);
	}
	
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return mantenimientoDao.delete(id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return mantenimientoDao.read(id);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return mantenimientoDao.readAll();
	}
}
