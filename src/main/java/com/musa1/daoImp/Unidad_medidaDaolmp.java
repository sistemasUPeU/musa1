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

import com.musa1.dao.Unidad_medidaDao;
import com.musa1.entity.Unidad_medida;

import oracle.jdbc.internal.OracleTypes;
@Repository
public class Unidad_medidaDaolmp implements Unidad_medidaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Unidad_medida unidad_medida) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_unidad_medida.sp_add_unidad_medida(?)", unidad_medida.getUnidad_medida());
	}
	@Override
	public int edit(Unidad_medida unidad_medida) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_unidad_medida.sp_add_unidad_medida(?,?)", unidad_medida.getId_unidad_medida(), unidad_medida.getUnidad_medida());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_unidad_medida.sp_add_unidad_medida(?)",id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_UNIDAD_MEDIDA").withCatalogName("pkg_crud_unidad_medida")
				.declareParameters(new SqlOutParameter("unid_med", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("UM_ID", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("UM_ID", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub

<<<<<<< HEAD
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_UNIDAD_MEDIDA").withCatalogName("pkg_crud_unidad_medida")
				.declareParameters(new SqlOutParameter("unid_med", OracleTypes.CURSOR, new ColumnMapRowMapper()));

		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName
				("SP_READALL_UNIDAD_MEDIDA").withCatalogName("pkg_crud_unidad_medida")
				.declareParameters(new SqlOutParameter("uni_med", OracleTypes.CURSOR, new ColumnMapRowMapper()));

=======
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName
				("SP_READALL_UNIDAD_MEDIDA").withCatalogName("pkg_crud_unidad_medida")
				.declareParameters(new SqlOutParameter("uni_med", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_UNIDAD_MEDIDA").withCatalogName("pkg_crud_unidad_medida")
				.declareParameters(new SqlOutParameter("unid_med", OracleTypes.CURSOR, new ColumnMapRowMapper()));
>>>>>>> prueba
		return simpleJdbcCall.execute();
	}
	
	

}
