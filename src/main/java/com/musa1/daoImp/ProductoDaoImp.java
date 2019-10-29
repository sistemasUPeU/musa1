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

import com.musa1.dao.ProductoDao;
import com.musa1.entity.Producto;

import oracle.jdbc.internal.OracleTypes;

public class ProductoDaoImp implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Producto producto) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_producto.insertar_producto(?,?,?,?,?,?)",producto.getNombre_producto(),producto.getDescripcion(),producto.getId_categoria(),producto.getId_unidad_medida(),producto.getCodigo(),producto.getId_marca());
	}

	@Override
	public int edit(Producto producto) {
		// TODO Auto-generated method stub	
		return jdbcTemplate.update("call pkg_crud_producto.actualizar_producto(?,?,?,?,?,?,?)",producto.getId_producto(),producto.getNombre_producto(),producto.getDescripcion(),producto.getId_categoria(),producto.getId_unidad_medida(),producto.getCodigo(),producto.getId_marca());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_producto.eliminar_producto(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall =new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_PRODUCTO").withCatalogName("pkg_crud_producto")
				.declareParameters(new SqlOutParameter("prod",OracleTypes
						.CURSOR,new ColumnMapRowMapper()),new SqlParameter("idpr", Types.INTEGER));
				SqlParameterSource in =new MapSqlParameterSource().addValue("idpr", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_PRODUCTO").withCatalogName("pkg_crud_producto")
				.declareParameters(new SqlOutParameter("prod", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	
}
