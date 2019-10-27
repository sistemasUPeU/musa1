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

import com.musa1.dao.Tipo_requisitoDao;
import com.musa1.entity.Tipo_requisito;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class Tipo_requisitoDaoImp implements Tipo_requisitoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Tipo_requisito tipo_requisito) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_requisito.sp_add_tipo_requisito(?,?)",tipo_requisito.getRequisito(),tipo_requisito.getEstado());
	}

	@Override
	public int edit(Tipo_requisito tipo_requisito) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_requisito.sp_update_tipo_requisito(?,?,?)",tipo_requisito.getId_tipo_requisito(),tipo_requisito.getRequisito(),tipo_requisito.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_requisito.sp_delete_tipo_requisito(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_TIPO_REQUISITO").withCatalogName("pkg_crud_tipo_requisito")
				.declareParameters(new SqlOutParameter("tipo_req", OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("idtr", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idtr", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_TIPO_REQUISITO").withCatalogName("pkg_crud_tipo_requisito")
				.declareParameters(new SqlOutParameter("tipo_req", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
