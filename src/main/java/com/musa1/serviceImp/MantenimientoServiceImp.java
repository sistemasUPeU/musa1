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

	@Override
	public int update_estado(int ide) {
		// TODO Auto-generated method stub
		return mantenimientoDao.update_estado(ide);
	}
	@Override
	public Map<String, Object> read_id_bus(String padron) {
		// TODO Auto-generated method stub
		return mantenimientoDao.read_id_bus(padron);
	}
	@Override
	public Map<String, Object> searchPadron(String nombre) {
		// TODO Auto-generated method stub
		return mantenimientoDao.searchPadron(nombre);
	}
	@Override
	public int update_observacion(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		return mantenimientoDao.update_observacion(mantenimiento);
<<<<<<< HEAD
=======
	}

	@Override
	public Map<String, Object> readAllVal2() {
		// TODO Auto-generated method stub
		return mantenimientoDao.readAllVal2();
>>>>>>> dany2
	}
}
