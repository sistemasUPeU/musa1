package com.musa1.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.GrupoDao;
import com.musa1.entity.Grupo;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class GrupoDaoImp implements GrupoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Grupo g) {
		// TODO Auto-generated method stub
		System.out.println("mes:" + g.getId_mes());
		return jdbcTemplate.update("call pkg_crud_grupo.sp_insertgrupo(?,?,?,?,?)", g.getNumero(), g.getCantidad_buses(), g.getHora_inicio(), g.getIntervalo(), g.getId_mes());
	}
	
	@Override
	public int update(int estado) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_grupo.sp_updategrupo(?)", estado);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_grupo.sp_deletegrupo(?)", id);
	}
	
	@Override
	public Map<String, Object> readAll(int tipoconsulta) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTGRUPO").withCatalogName("PKG_CRUD_grupo")
		.declareParameters( new SqlOutParameter("grup", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("TIPOCONSULTA", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("TIPOCONSULTA", tipoconsulta);
				return simpleJdbcCall.execute(in);
	}

}
