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

import com.musa1.dao.TipoVinculacionDao;
import com.musa1.entity.TipoVinculacion;

import oracle.jdbc.OracleTypes;

@Repository
public class TipoVinculacionDaoImp implements TipoVinculacionDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(TipoVinculacion tipoVinculacion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_vinculacion.sp_add_tipo_vinculacion(?,?)",tipoVinculacion.getVinculacion(),tipoVinculacion.getEstado());
	}

	@Override
	public int update(TipoVinculacion tipoVinculacion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_vinculacion.sp_add_tipo_vinculacion(?,?,?)",tipoVinculacion.getId_tipo_vinculacion(),tipoVinculacion.getVinculacion(),tipoVinculacion.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_vinculacion.sp_add_tipo_vinculacion(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_TIPO_VINCULACION").withCatalogName("pkg_crud_tipo_vinculacion")
				.declareParameters(new SqlOutParameter("tipo_vinc", OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("idtv", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idtv", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_TIPO_VINCULACION").withCatalogName("pkg_crud_tipo_vinculacion")
				.declareParameters(new SqlOutParameter("tipo_vinc", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
