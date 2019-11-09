package com.musa1.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.MesDao;
import com.musa1.entity.Mes;

import oracle.jdbc.internal.OracleTypes;



@Repository
public class MesDaoImp implements MesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	
	
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall =  new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTARMES").withCatalogName("PKG_CRUD_GRUPO")
				.declareParameters(new SqlOutParameter("MES", OracleTypes.CURSOR , new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
