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

import com.musa1.entity.DetalleMantenimiento;
import com.musa1.dao.DetalleMantenimientoDao;
import oracle.jdbc.internal.OracleTypes;
@Repository
public class DetalleMantenimientoDaoImp implements DetalleMantenimientoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(DetalleMantenimiento detallemantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_DETALLE_ACCION_MANT.SP_INSERTAR_DET_ACC_MANT (?,?,?)", detallemantenimiento.getRevision(), detallemantenimiento.getId_accion(), detallemantenimiento.getId_mantenimiento());
	}
	
	@Override
	public int update(DetalleMantenimiento detallemantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_DETALLE_ACCION_MANT.SP_MODIFICAR_DET_ACC_MANT (?,?,?,?)",detallemantenimiento.getId_detalle_accion_mant(), detallemantenimiento.getRevision(), detallemantenimiento.getId_accion(), detallemantenimiento.getId_mantenimiento());
	}
	
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_DETALLE_ACCION_MANT.SP_ELIMINAR_DET_ACC_MANT(?)",id);
	}
	
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_DET_ACC_MANT").withCatalogName("PKG_CRUD_DETALLE_ACCION_MANT")
				.declareParameters(new SqlOutParameter("DETALLE_MANT", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDP", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDP", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_MANT_1").withCatalogName("PKG_CRUD_DETALLE_ACCION_MANT")
				.declareParameters(new SqlOutParameter("(LISTA_MANTENIMIENTO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	
	@Override
	public Map<String, Object> read_detalle_ojito_mant(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_DETALLE_OJITO_MANT").withCatalogName("PKG_CRUD_DETALLE_ACCION_MANT")
				.declareParameters(new SqlOutParameter("LIST_ACCIONES_MANT", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDP", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDP", id);
		return simpleJdbcCall.execute(in);
	}
	
	@Override
	public int update_accion(DetalleMantenimiento detallemantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_DETALLE_ACCION_MANT.SP_MODIFICAR_DETALLE_ACCION (?,?)",detallemantenimiento.getId_detalle_accion_mant(), detallemantenimiento.getRevision());	
	}
}
