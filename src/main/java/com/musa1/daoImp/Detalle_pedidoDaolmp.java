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

import com.musa1.dao.Detalle_pedidoDao;
import com.musa1.entity.Detalle_pedido;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class Detalle_pedidoDaolmp implements Detalle_pedidoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Detalle_pedido detalle_pedido) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("cal pkg_crud_detalle_pedido.sp_insertar_detalle_pedido (?,?)", 
								  detalle_pedido.getId_pedido(), detalle_pedido.getId_producto());
	}
	@Override
	public int update(Detalle_pedido detalle_pedido) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_PEDIDO.SP_MODIFICAR_PEDIDO (?,?,?)", detalle_pedido.getId_detalle_pedido(), detalle_pedido.getId_pedido(), detalle_pedido.getId_producto());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_pedido.sp_eliminar_pedido(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("sp_read_detalle_pedido").withCatalogName("pkg_crud_detalle_pedido")
				.declareParameters(new SqlOutParameter("deta_pedi",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("d_id", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("d_id", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_DETALLE_FECHA_PEDIDO").withCatalogName("PKG_DETALLE_PEDIDO")
				.declareParameters(new SqlOutParameter("LIST_FECHA", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> read_detalle(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall =new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_DETALLE_OJITO").withCatalogName("PKG_DETALLE_PEDIDO")
				.declareParameters(new SqlOutParameter("LIST_DETALLE",OracleTypes.CURSOR,new ColumnMapRowMapper()),new SqlParameter("IDP", Types.INTEGER));
				SqlParameterSource in =new MapSqlParameterSource().addValue("IDP", id);
		return simpleJdbcCall.execute(in);
	}
	
}
