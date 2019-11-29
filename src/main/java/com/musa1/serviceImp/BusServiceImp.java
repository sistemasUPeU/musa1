package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.BusDao;
import com.musa1.entity.Bus;
import com.musa1.entity.VinculacionRequisito;
import com.musa1.service.BusService;

@Service
public class BusServiceImp implements BusService{
	@Autowired
	private BusDao busDao;
	
	@Override
	public int create(Bus b) {
		// TODO Auto-generated method stub
		return busDao.create(b);
	}

	@Override
	public int update(Bus b) {
		// TODO Auto-generated method stub
		return busDao.update(b);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return busDao.delete(id);
	}

	@Override
	public Map<String, Object> read(String placa) {
		// TODO Auto-generated method stub
		return busDao.read(placa);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return busDao.readAll();
	}

	@Override
	public int createVin(VinculacionRequisito vr) {
		// TODO Auto-generated method stub
		return busDao.createVin(vr);
	}

	@Override
	public Map<String, Object> read2() {
		// TODO Auto-generated method stub
		return busDao.read2();
	}

}
