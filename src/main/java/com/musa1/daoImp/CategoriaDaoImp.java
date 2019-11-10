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

import com.musa1.dao.CategoriaDao;
import com.musa1.entity.Categoria;

import oracle.jdbc.OracleTypes;

@Repository
public class CategoriaDaoImp implements CategoriaDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Categoria c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_categoria.sp_insertar_categoria(?)",c.getNombre_categoria());
	}

	@Override
	public int update(Categoria c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_categoria.SP_ACTUALIZAR_CATEGORIA(?,?)",c.getId_categoria(),c.getNombre_categoria());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_categoria.sp_eliminar_categoria(?)",id);
	}


	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall= new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_readAll_categoria").withCatalogName("pkg_crud_categoria")
				.declareParameters(new SqlOutParameter("cat",OracleTypes.CURSOR));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_CATEGORIA").withCatalogName("pkg_crud_categoria")
				.declareParameters(new SqlOutParameter("LIS_CAT",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("CAT_ID",Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("CAT_ID", id);
		return simpleJdbcCall.execute(in);
	}

}