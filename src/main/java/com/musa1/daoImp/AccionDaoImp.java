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

import com.musa1.dao.AccionDao;
import com.musa1.entity.Accion;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class AccionDaoImp implements AccionDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Accion accion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_accion.sp_insertar_accion (?,?,?)", accion.getNom_accion(),accion.getEstado(),accion.getId_tipo_accion());
	}

	@Override
	public int update(Accion accion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_accion.sp_modificar_accion (?,?,?,?)",accion.getA_id(),accion.getNom_accion(),accion.getEstado(),accion.getId_tipo_accion());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_accion.sp_eliminar_accion(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("sp_read_accion").withCatalogName("pkg_crud_accion")
				.declareParameters(new SqlOutParameter("ac",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("a_id", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("a_id", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_readall_accion").withCatalogName("pkg_crud_accion")
				.declareParameters(new SqlOutParameter("ac", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
