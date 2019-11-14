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

import com.musa1.dao.ProductoDao;
import com.musa1.entity.Producto;

import oracle.jdbc.internal.OracleTypes;
@Repository
public class ProductoDaoImp implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Producto producto) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_PRODUCTO.SP_INSERTAR_PRODUCTO(?,?,?,?,?)",producto.getNombre_producto(),producto.getDescripcion(),producto.getId_categoria(),producto.getId_unidad_medida(),producto.getId_marca());
	}

	@Override
	public int edit(Producto producto) {
		// TODO Auto-generated method stub	
		return jdbcTemplate.update("call PKG_CRUD_PRODUCTO.SP_ACTUALIZAR_PRODUCTO(?,?,?,?,?,?)",producto.getId_producto(),producto.getNombre_producto(),producto.getDescripcion(),producto.getId_categoria(),producto.getId_unidad_medida(),producto.getId_marca());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_PRODUCTO.SP_ELIMINAR_PRODUCTO(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall =new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_PRODUCTO").withCatalogName("PKG_CRUD_PRODUCTO")
				.declareParameters(new SqlOutParameter("LIS_PROD",OracleTypes.CURSOR,new ColumnMapRowMapper()),new SqlParameter("PROD_ID", Types.INTEGER));
				SqlParameterSource in =new MapSqlParameterSource().addValue("PROD_ID", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_CONSULTA_PRODUCTO").withCatalogName("PKG_CRUD_PRODUCTO")
				.declareParameters(new SqlOutParameter("LIS_PROD", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}


	
}