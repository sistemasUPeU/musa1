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

import com.musa1.dao.VinculacionDao;
import com.musa1.entity.Vinculacion;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class VinculacionDaoImp implements VinculacionDao{
	
	@Autowired
	private JdbcTemplate jdbc;
	private SimpleJdbcCall call;
	
	@Override
	public Map<String, Object> crearVinculacionBus(Vinculacion e) {
		call = new SimpleJdbcCall(jdbc).withProcedureName("SP_INSERT_VC_BUS").withCatalogName("PKG_CRUD_VINCULACION_BUS")
				.declareParameters(new SqlParameter("f_e", Types.VARCHAR), new SqlParameter("f_t", Types.VARCHAR), new SqlParameter("bus", Types.INTEGER), new SqlOutParameter("idv", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("f_e", e.getF_emision()).addValue("f_t", e.getF_termino()).addValue("bus", e.getId_bus());
		return call.execute(in);
	}

	@Override
	public Map<String, Object> listarVistaVinculacionBus() {
		call = new SimpleJdbcCall(jdbc).withProcedureName("sp_listar_vinculaciones").withCatalogName("pkg_crud_vinculacion_bus")
				.declareParameters(new SqlOutParameter("vcs", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

	@Override
	public Map<String, Object> readVinculacionConductor() {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc).withProcedureName("sp_read_vinculacion_conductor").withCatalogName("pkg_crud_vinculacion")
				.declareParameters(new SqlOutParameter("vinc", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

	@Override
	public Map<String, Object> createVinculacionConductor(Vinculacion vinculacion) {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc).withProcedureName("SP_ADD_VINCULACION_CONDUCTOR").withCatalogName("pkg_crud_vinculacion")
				.declareParameters(new SqlParameter("fecha_e", Types.VARCHAR), new SqlParameter("fecha_t", Types.VARCHAR), new SqlParameter("idp", Types.INTEGER), new SqlOutParameter("idv", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("fecha_e", vinculacion.getF_emision()).addValue("fecha_t", vinculacion.getF_termino()).addValue("idp", vinculacion.getId_persona_conductor());
		return call.execute(in);
	}

}
