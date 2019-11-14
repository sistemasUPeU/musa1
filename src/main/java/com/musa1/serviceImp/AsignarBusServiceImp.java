package com.musa1.serviceImp;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.AsignarBusDao;
import com.musa1.service.AsignarBusService;

@Service
public class AsignarBusServiceImp implements AsignarBusService {
	@Autowired
	private AsignarBusDao dao;

	@Override
	public Map<String, Object> readAsignarBus() {
		// TODO Auto-generated method stub
		return dao.readAsignarBus();
	}

	@Override
	public Map<String, Object> readParadero() {
		// TODO Auto-generated method stub
		return dao.readParadero();
	

	
	}
}
