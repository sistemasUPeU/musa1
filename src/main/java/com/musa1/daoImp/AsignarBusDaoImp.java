package com.musa1.daoImp;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.AsignarBusDao;

import oracle.jdbc.OracleTypes;

@Repository
public class AsignarBusDaoImp implements AsignarBusDao{

	@Autowired
	private JdbcTemplate jdbc;
	private SimpleJdbcCall call;
	
	
	@Override
	public Map<String, Object> readAsignarBus() {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc)
				.withProcedureName("consult_asignar_bus").withCatalogName("pkg_asignar_bus")
				.declareParameters(new SqlOutParameter("CU", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

	@Override
	public Map<String, Object> readParadero() {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc)
				.withProcedureName("LIST_PARADERO").withCatalogName("pkg_asignar_bus")
				.declareParameters(new SqlOutParameter("LS", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

	

}
