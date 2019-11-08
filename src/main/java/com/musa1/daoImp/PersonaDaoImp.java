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

import com.musa1.dao.PersonaDao;
import com.musa1.entity.Persona;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class PersonaDaoImp implements PersonaDao {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Persona persona) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_persona.sp_add_persona(?,?,?,?,?,?)",persona.getNombre_persona(),persona.getApellido_paterno(),persona.getApellido_materno(),persona.getNro_documento(),persona.getCelular(),persona.getId_tipo_documento());
	}
	@Override
	public int edit(Persona persona) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_persona.sp_update_persona(?,?,?,?,?,?,?)",persona.getId_persona(),persona.getNombre_persona(),persona.getApellido_paterno(),persona.getApellido_materno(),persona.getNro_documento(),persona.getCelular(),persona.getId_tipo_documento());
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_persona.sp_delete_persona(?)",id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_PERSONA").withCatalogName("pkg_crud_persona")
				.declareParameters(new SqlOutParameter("pers",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("idp", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("idp", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_PERSONA").withCatalogName("pkg_crud_persona")
				.declareParameters(new SqlOutParameter("pers", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	@Override
	public Map<String, Object> searchPersona(String nombre) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withFunctionName("FN_SEARCH_PERSONA")
				.declareParameters(new SqlParameter("nombre", Types.VARCHAR));
		SqlParameterSource in = new MapSqlParameterSource().addValue("nombre", nombre);
		return simpleJdbcCall.execute(in);
	}
	
	
}
