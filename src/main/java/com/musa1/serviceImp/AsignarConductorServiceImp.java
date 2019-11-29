package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.AsignarConductorDao;
import com.musa1.service.AsignarConductorService;

@Service
public class AsignarConductorServiceImp implements AsignarConductorService {
	
	@Autowired
	private AsignarConductorDao AsignarConductorDao;

	@Override
	public Map<String, Object> readAsignarConductor() {
		// TODO Auto-generated method stub
		return AsignarConductorDao.readAsignarConductor();
	}

}
