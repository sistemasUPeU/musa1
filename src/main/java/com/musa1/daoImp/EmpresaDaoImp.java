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

import com.musa1.dao.EmpresaDao;
import com.musa1.entity.Empresa;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class EmpresaDaoImp implements EmpresaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Empresa empresa) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_empresa.sp_insertar_empresa (?,?,?,?)",empresa.getRason_social(),empresa.getRuc(),empresa.getResponsable_social(),empresa.getId_ubigeo());
	}

	@Override
	public int update(Empresa empresa) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_empresa.sp_modificar_empresa (?,?,?,?,?)",empresa.getRason_social(),empresa.getRuc(),empresa.getResponsable_social(),empresa.getId_ubigeo(),empresa.getId_empresa() );
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_empresa.sp_eliminar_empresa (?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("sp_read_empresa").withCatalogName("pkg_crud_empresa")
				.declareParameters(new SqlOutParameter("emp",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("e_id", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("e_id", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_readall_empresa").withCatalogName("pkg_crud_empresa")
				.declareParameters(new SqlOutParameter("emp", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
