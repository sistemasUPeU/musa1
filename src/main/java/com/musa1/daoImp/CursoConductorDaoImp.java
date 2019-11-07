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

import com.musa1.dao.CursoConductorDao;
import com.musa1.entity.CursoConductor;

import ch.qos.logback.classic.db.SQLBuilder;
import oracle.jdbc.internal.OracleTypes;

@Repository
public class CursoConductorDaoImp implements CursoConductorDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(CursoConductor cursoConductor) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_curso_conductor.sp_add_curso_conductor(?,?,?,?,?,?,?)",cursoConductor.getF_inicio(),cursoConductor.getF_fin(),cursoConductor.getCarnet_c(),cursoConductor.getF_caducidad(),cursoConductor.getF_emision(),cursoConductor.getId_curso(),cursoConductor.getId_persona());
	}

	@Override
	public int update(CursoConductor cursoConductor) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_curso_conductor.sp_update_curso_conductor(?,?,?,?,?)",cursoConductor.getId_curso_conductor(),cursoConductor.getEstado(),cursoConductor.getCarnet_c(),cursoConductor.getF_caducidad(),cursoConductor.getF_emision());
	}

	@Override
	public Map<String, Object> searchCursoConductor(String nombre) {
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

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_CURSO_CONDUCTOR").withCatalogName("pkg_curso_conductor")
				.declareParameters(new SqlOutParameter("dato", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idc", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idc", id);
		return simpleJdbcCall.execute(in);
	}

}
