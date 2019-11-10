package com.musa1.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
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
		return jdbcTemplate.update("call PKG_CRUD_CATEGORIA.sp_insertar_categoria(?)",c.getNombre_categoria());
	}

	@Override
	public int update(Categoria c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_CATEGORIA.sp_modificar_categoria",c.getNombre_categoria());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_CATEGORIA.sp_eliminar_categoria",id);
	}


	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall= new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_CATEGORIA").withCatalogName("PKG_CRUD_CATEGORIA")
				.declareParameters(new SqlOutParameter("LIS_CAT",OracleTypes.CURSOR));
		return simpleJdbcCall.execute();
	}

}