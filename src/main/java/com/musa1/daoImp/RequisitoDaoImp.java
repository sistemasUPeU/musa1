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

import com.musa1.dao.RequisitoDao;
import com.musa1.entity.Requisito;

import oracle.jdbc.OracleTypes;

@Repository
public class RequisitoDaoImp implements RequisitoDao{
	@Autowired
	private JdbcTemplate jdbc;
	private SimpleJdbcCall call;

	@Override
	public Map<String, Object> listarRequisitosBus() {
		call = new SimpleJdbcCall(jdbc).withProcedureName("sp_listar_requisito_tipo").withCatalogName("pkg_crud_requisito")
				.declareParameters(new SqlParameter("tr", Types.VARCHAR), new SqlOutParameter("reqs", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("tr", "Bus");
		return call.execute(in);
	}

	@Override
	public int create(Requisito requisito) {
		// TODO Auto-generated method stub
		return jdbc.update("call pkg_crud_requisito.sp_add_requisito(?,?,?)",requisito.getNombre_requisito(), requisito.getId_tipo_requisito(), requisito.getObligatorio());
	}

	@Override
	public int update(Requisito requisito) {
		// TODO Auto-generated method stub
		return jdbc.update("call pkg_crud_requisito.sp_update_requisito(?,?,?,?)",requisito.getId_requisito(),requisito.getNombre_requisito(), requisito.getId_tipo_requisito(), requisito.getObligatorio());
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc)
				.withProcedureName("SP_READ_REQUISITO").withCatalogName("pkg_crud_requisito")
				.declareParameters(new SqlOutParameter("req", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idr", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idr", id);
		return call.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc).withProcedureName("SP_READALL_REQUISITO").withCatalogName("pkg_crud_requisito")
				.declareParameters(new SqlOutParameter("req", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

	@Override
	public Map<String, Object> readRequisitoConductor() {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc).withProcedureName("sp_listar_requisito_tipo").withCatalogName("pkg_crud_requisito")
				.declareParameters(new SqlParameter("tr", Types.VARCHAR), new SqlOutParameter("reqs", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("tr", "Conductor");
		return call.execute(in);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbc.update("call pkg_crud_requisito.sp_delete_requisito(?)",id);
	}
	
}
