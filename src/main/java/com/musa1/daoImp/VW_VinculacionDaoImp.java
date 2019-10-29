package com.musa1.daoImp;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.VW_VinculacionDao;
import com.musa1.entity.VW_Vinculacion;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class VW_VinculacionDaoImp implements VW_VinculacionDao{
	@Autowired
	private JdbcTemplate jdbc;
	private SimpleJdbcCall call;

	@Override
	public Map<String, Object> readAll() {
		call = new SimpleJdbcCall(jdbc).withProcedureName("sp_listar_vinculaciones").withCatalogName("pkg_crud_vinculacion_bus")
				.declareParameters(new SqlOutParameter("vcs", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

}
