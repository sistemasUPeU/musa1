package com.musa1.serviceImp;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.DetalleMantenimientoDao;
import com.musa1.entity.DetalleMantenimiento;
import com.musa1.service.DetalleMantenimientoService;

@Service
public class DetalleMantenimientoServiceImp implements DetalleMantenimientoService{
	@Autowired
	private DetalleMantenimientoDao detallemantenimientoDao;
	@Override
	public int create(DetalleMantenimiento detallemantenimiento) {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.create(detallemantenimiento);
	}

	@Override
	public int update(DetalleMantenimiento detallemantenimiento) {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.update(detallemantenimiento);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.readAll();
	}
	@Override
	public Map<String, Object> read_detalle_ojito_mant(int id) {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.read_detalle_ojito_mant(id);
	}

	@Override
	public int update_accion(DetalleMantenimiento detallemantenimiento) {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.update(detallemantenimiento);
	}
	
	@Override
	public Map<String, Object> read_detalle_mant(int id) {
		// TODO Auto-generated method stub
		return detallemantenimientoDao.read_detalle_mant(id);
	}


}
