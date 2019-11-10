package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.ReporteDao;
import com.musa1.entity.Reporte;
import com.musa1.service.ReporteService;
@Service
public class ReporteServicelmp implements ReporteService{

	@Autowired
	private ReporteDao reporteDao;

	@Override
	public int create(Reporte reporte) {
		// TODO Auto-generated method stub
		return reporteDao.create(reporte);
	}

	@Override
	public int edit(Reporte reporte) {
		// TODO Auto-generated method stub
		return reporteDao.edit(reporte);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return reporteDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return reporteDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return reporteDao.readAll();
	}
}
