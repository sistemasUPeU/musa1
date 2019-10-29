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

import com.musa1.dao.TipoAccionDao;
import com.musa1.entity.TipoAccion;

import oracle.jdbc.OracleTypes;

@Repository
public class TipoAccionDaoImp implements TipoAccionDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(TipoAccion tipo_accion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_accion.sp_insertar_tipo_accion(?,?)", tipo_accion.getTipo_accion(),tipo_accion.getEstado());
	}
	@Override
	public int update(TipoAccion tipo_accion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_accion.sp_modificar_tipo_accion(?,?,?)", tipo_accion.getId_tipo_accion(),tipo_accion.getTipo_accion(),tipo_accion.getEstado());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_accion.sp_eliminar_tipo_accion(?)",id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall= new SimpleJdbcCall(jdbcTemplate).
				withProcedureName("sq_read_tipo_accion").withCatalogName("pkg_crud_tipo_accion").
				declareParameters(new SqlOutParameter("tipa",OracleTypes.CURSOR, new ColumnMapRowMapper()),new SqlParameter("ta_id", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ta_id" ,id);
		
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_readall_tipo_accion").withCatalogName("pkg_crud_tipo_accion")
				.declareParameters(new SqlOutParameter("tipa", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
