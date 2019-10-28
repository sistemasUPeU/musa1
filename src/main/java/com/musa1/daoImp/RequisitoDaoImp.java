package com.musa1.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.RequisitoDao;

import oracle.jdbc.OracleTypes;

@Repository
public class RequisitoDaoImp implements RequisitoDao{
	@Autowired
	private JdbcTemplate jdbc;
	private SimpleJdbcCall call;

	@Override
	public Map<String, Object> listarRequisitosBus() {
		call = new SimpleJdbcCall(jdbc).withProcedureName("sp_requisito_bus").withCatalogName("pkg_crud_vinculacion_bus")
				.declareParameters(new SqlOutParameter("reqs", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}
	
}
