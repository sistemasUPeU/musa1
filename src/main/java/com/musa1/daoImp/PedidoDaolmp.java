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

import com.musa1.dao.PedidoDao;
import com.musa1.entity.Pedido;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class PedidoDaolmp implements PedidoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Pedido pedido) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_pedido.sp_add_pedido(?,?,?,?,?,?)", pedido.getFecha_pedido(), pedido.getFecha_entrega(), pedido.getId_mantenimiento(), pedido.getPersona_autoriza(), pedido.getPersona_registra(), pedido.getEstado());
	}
	@Override
	public int edit(Pedido pedido) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_persona.sp_update_pedido(?,?,?,?,?,?,?)", pedido.getId_pedido(), pedido.getFecha_pedido(), pedido.getFecha_entrega(), pedido.getId_mantenimiento(), pedido.getPersona_autoriza(), pedido.getPersona_registra());
		
		
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_pedido.sp_delete_persona(?)", id);
		
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_PEDIDO").withCatalogName("pkg_crud_pedido")
				.declareParameters(new SqlOutParameter("pedi", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idp", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("idp", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_PEDIDO").withCatalogName("pkg_crud_pedido")
				.declareParameters(new SqlOutParameter("pedi", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		
		return simpleJdbcCall.execute();
	}

	
}
