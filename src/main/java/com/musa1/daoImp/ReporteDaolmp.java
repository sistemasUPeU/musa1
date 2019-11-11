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

import com.musa1.dao.ReporteDao;
import com.musa1.entity.Reporte;

import oracle.jdbc.internal.OracleTypes;
@Repository
public class ReporteDaolmp implements ReporteDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Reporte reporte) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REPORTE.SP_INSERTAR_REPORTE(?)",reporte.getReporte() );
	}
	@Override
	public int edit(Reporte reporte) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REPORTE.SP_ACTUALIZAR_REPORTE(?,?)", reporte.getIdreporte(), reporte.getReporte());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REPORTE.SP_ELIMINAR_REPORTE(?)",id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall =new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_REPORTE").withCatalogName("PKG_CRUD_REPORTE")
				.declareParameters(new SqlOutParameter("LIS_REPOR",OracleTypes.CURSOR,new ColumnMapRowMapper()),new SqlParameter("REPOR_ID", Types.INTEGER));
				SqlParameterSource in =new MapSqlParameterSource().addValue("REPOR_ID", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_REPORTE").withCatalogName("PKG_CRUD_REPORTE")
				.declareParameters(new SqlOutParameter("LIS_REPOR", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	

}
