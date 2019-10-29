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

import com.musa1.dao.TipoMantenimientoDao;
import com.musa1.entity.TipoMantenimiento;

import oracle.jdbc.internal.OracleTypes;
@Repository
public class TipoMantenimientoDaoImp implements TipoMantenimientoDao{
	
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(TipoMantenimiento tipomantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_TIPO_MANTENIMIENTO.SP_INSERTAR_TIPO_MANTENIMIENTO(?)",tipomantenimiento.getTipo_mantenimiento());
	}
	@Override
	public int edit(TipoMantenimiento tipomantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_TIPO_MANTENIMIENTO.SP_MODIFICA_TIPO_MANTENIMIENTO(?,?)",tipomantenimiento.getId_tipo_mantenimiento(),tipomantenimiento.getTipo_mantenimiento());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_TIPO_MANTENIMIENTO.SP_ELIMINAR_TIPO_MANTENIMIENTO(?)",id);
	}
	
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_TIPO_MANTENIMIENTO").withCatalogName("PKG_CRUD_TIPO_MANTENIMIENTO")
				.declareParameters(new SqlOutParameter("TIPO_MANT", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDP", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDP", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_TIPO_MANTENIMIENTO").withCatalogName("PKG_CRUD_TIPO_MANTENIMIENTO")
				.declareParameters(new SqlOutParameter("TIPO_MANT", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
}
