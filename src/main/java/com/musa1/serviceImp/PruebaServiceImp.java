package com.musa1.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.PruebaDao;
import com.musa1.service.PruebaService;


@Service
public class PruebaServiceImp implements PruebaService{
    @Autowired
    PruebaDao pruebaDao;
	@Override
	public String listar(String x) {
		// TODO Auto-generated method stub
		return pruebaDao.listar(x);
	}

}
