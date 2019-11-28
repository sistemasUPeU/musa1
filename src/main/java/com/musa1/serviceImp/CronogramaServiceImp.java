package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.CronogramaDao;
import com.musa1.entity.CronogramaBus;
import com.musa1.entity.Periodo;
import com.musa1.service.CronogramaService;

@Service
public class CronogramaServiceImp implements CronogramaService {

	@Autowired
	private CronogramaDao cronogramaDao;
	
	@Override
	public int createcrono() {
		// TODO Auto-generated method stub
		return cronogramaDao.createcrono();
	}

	@Override
	public int update(Periodo p) {
		// TODO Auto-generated method stub
		return cronogramaDao.update(p);
	}

	@Override
	public int create(CronogramaBus cb) {
		// TODO Auto-generated method stub
		return cronogramaDao.create(cb);
	}

	@Override
	public Map<String, Object> readperido() {
		// TODO Auto-generated method stub
		return cronogramaDao.readperido();
	}

	@Override
	public Map<String, Object> readAll( int periodo) {
		// TODO Auto-generated method stub
		return cronogramaDao.readAll(periodo);
	}

	@Override
	public Map<String, Object> readAllC(int periodo) {
		// TODO Auto-generated method stub
		return cronogramaDao.readAllC(periodo);
	}

}
