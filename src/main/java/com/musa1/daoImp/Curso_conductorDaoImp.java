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

import com.musa1.dao.Curso_conductorDao;
import com.musa1.entity.Curso_conductor;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class Curso_conductorDaoImp implements Curso_conductorDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Curso_conductor curso_conductor) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_curso_conductor.sp_add_curso_conductor(?,?,?,?,?,?,?,?)",curso_conductor.getF_inicio(),curso_conductor.getF_fin(),curso_conductor.getEstado(),curso_conductor.getCarnet_c(),curso_conductor.getF_caducidad(),curso_conductor.getF_emision(),curso_conductor.getId_curso(),curso_conductor.getId_persona());
	}

	@Override
	public int update(Curso_conductor curso_conductor) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_curso_conductor.sp_update_curso_conductor(?,?,?,?,?)",curso_conductor.getId_curso_conducto(),curso_conductor.getEstado(),curso_conductor.getCarnet_c(),curso_conductor.getF_caducidad(),curso_conductor.getF_emision());
	}

	@Override
	public Map<String, Object> searchCurso_conductor(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withFunctionName("FN_SEARCH_CURSO_CONDUCTOR")
				.declareParameters(new SqlParameter("nombre", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("nombre",nombre);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_CURSO_CONDUCTOR").withCatalogName("pkg_curso_conductor")
				.declareParameters(new SqlOutParameter("dato", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
