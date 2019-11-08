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

import com.musa1.dao.RevisionDetalleDao;
import com.musa1.entity.RevisionDetalle;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class RevisionDetalleDaoImp implements RevisionDetalleDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(RevisionDetalle revisiondetalle) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_DETALLE.SP_INSERTAR_REVISION_DETALLE(?,?,?)",revisiondetalle.getEvaluacion(),revisiondetalle.getId_revision_detalle(),revisiondetalle.getId_accion());
	}

	@Override
	public int edit(RevisionDetalle revisiondetalle) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_DETALLE.SP_MODIFICAR_REVISION_DETALLE(?,?,?,?)",revisiondetalle.getId_revision_detalle(),revisiondetalle.getEvaluacion(),revisiondetalle.getId_revision_tecnica(),revisiondetalle.getId_accion());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_DETALLE.SP_ELIMINAR_REVISION_DETALLE(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_REVISION_DETALLE").withCatalogName("PKG_CRUD_REVISION_DETALLE")
				.declareParameters(new SqlOutParameter("REVDET",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("IDRD", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("IDRD", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_REVISION_DETALLE").withCatalogName("PKG_CRUD_REVISION_DETALLE")
				.declareParameters(new SqlOutParameter("REVDET", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
