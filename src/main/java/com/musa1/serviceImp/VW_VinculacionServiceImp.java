package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.VW_VinculacionDao;
import com.musa1.service.VW_VinculacionService;

@Service
public class VW_VinculacionServiceImp implements VW_VinculacionService{
	@Autowired
	private VW_VinculacionDao dao;

	@Override
	public Map<String, Object> readAll() {
		return dao.readAll();
	}
}
