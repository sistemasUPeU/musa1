package com.musa1.daoImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.musa1.dao.PruebaDao;


@Repository
public class PruebaDaoImp implements PruebaDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public String listar(String texto) {
		// TODO Auto-generated method stub		
		return texto;
	}

}
