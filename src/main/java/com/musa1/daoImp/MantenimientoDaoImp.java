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

import com.musa1.dao.MantenimientoDao;
import com.musa1.entity.Mantenimiento;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class MantenimientoDaoImp implements MantenimientoDao{
	@Autowired	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_MANTENIMIENTO.SP_INSERTAR_MANTENIMIENTO (?,?)",mantenimiento.getId_bus(), mantenimiento.getId_tipo_mantenimiento());
	}
	@Override
	public int update(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_MANTENIMIENTO.SP_MODIFICAR_MANTENIMIENTO (?,?,?,?,?,?)",mantenimiento.getId_mantenimiento(), mantenimiento.getFecha(), mantenimiento.getObservacion(), mantenimiento.getEstado(), mantenimiento.getId_bus(), mantenimiento.getId_tipo_mantenimiento(), mantenimiento.getId_empleado_registra());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_MANTENIMIENTO.SP_ELIMINAR_MANTENIMIENTO(?)",id);
	}
	
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_MANT").withCatalogName("PKG_CRUD_MANTENIMIENTO")
				.declareParameters(new SqlOutParameter("MANT", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_MANT", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_MANT", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_MANT").withCatalogName("PKG_CRUD_MANTENIMIENTO")
				.declareParameters(new SqlOutParameter("MANT", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> read_id_bus(String padron) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_ID_BUS").withCatalogName("PKG_CRUD_MANTENIMIENTO")
				.declareParameters(new SqlOutParameter("SALIDA_BUS", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("PADRON_ENVIADO", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("PADRON_ENVIADO", padron);
		return simpleJdbcCall.execute(in);
	}
	
	@Override
	public Map<String, Object> searchPadron(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withFunctionName("FN_SEARCH_PADRON")
				.declareParameters(new SqlParameter("nombre", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("nombre", nombre);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public int update_observacion(Mantenimiento mantenimiento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_MANTENIMIENTO.SP_MODIFICAR_OBSERVACION (?,?)",mantenimiento.getId_mantenimiento(), mantenimiento.getObservacion());
	}
	
}
