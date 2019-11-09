package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.MesDao;
import com.musa1.service.MesService;

@Service
public class MesServiceImp implements MesService {
	
	@Autowired
	private MesDao mesDao;
	
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return mesDao.readAll();
	}
	
}
