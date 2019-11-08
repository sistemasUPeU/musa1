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

import com.musa1.dao.OpcionDao;
import com.musa1.entity.Opcion;
import com.musa1.entity.OpcionUsuario;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class OpcionDaoImp implements OpcionDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Opcion opcion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call (?,?,?,?,?,?)",opcion.getPadre_id(),opcion.getNom_opcion(),opcion.getDescripcion(),opcion.getEnlace(),opcion.getOrden(),opcion.getEstado());
	}

	@Override
	public int addUsuarioOpcion(OpcionUsuario opcionUsuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Opcion opcion) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call (?,?,?,?,?,?,?)", opcion.getId_opcion(),opcion.getPadre_id(),opcion.getNom_opcion(),opcion.getDescripcion(),opcion.getEnlace(),opcion.getOrden(),opcion.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call (?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("").withCatalogName("")
				.declareParameters(new SqlOutParameter ("opc", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ido", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ido", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("").withCatalogName("")
				.declareParameters(new SqlOutParameter("opc", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
