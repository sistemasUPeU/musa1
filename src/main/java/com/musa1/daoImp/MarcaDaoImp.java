package com.musa1.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.MarcaDao;
import com.musa1.entity.Marca;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class MarcaDaoImp implements MarcaDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Marca m) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_MARCA.insertar_marca(?)",m.getNombre_marca());
	}

	@Override
	public int update(Marca m) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_MARCA.modificar_marca(?)",m.getNombre_marca());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_MARCA.ELIMINAR_MARCA(?)",id);	}
	
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_MARCA").withCatalogName("PKG_CRUD_MARCA")
				.declareParameters(new SqlOutParameter("LIS_MAR ", OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("MAR_ID", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("MAR_ID", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_MARCA").withCatalogName("PKG_CRUD_MARCA")
				.declareParameters(new SqlOutParameter("LIS_MAR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
