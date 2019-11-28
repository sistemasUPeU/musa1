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

import com.musa1.dao.CronogramaDao;
import com.musa1.entity.CronogramaBus;
import com.musa1.entity.Periodo;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class CronogramaDoaImp implements CronogramaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int createcrono() {
		// TODO Auto-generated method stub
		 String A = "a";
		System.out.println("Se genera el crono?");
		return jdbcTemplate.update("call pkg_cronograma_bus.sp_generar_crono(?)", A);
	}

	@Override
	public int update(Periodo p) {
		// TODO Auto-generated method stub
		System.out.println("se va a editar " + p.getNombre_periodo());
		return jdbcTemplate.update("call pkg_cronograma_bus.sp_update_periodo(?,?)", p.getId_periodo(), p.getNombre_periodo());
	}

	@Override
	public int create(CronogramaBus cb) {
		// TODO Auto-generated method stub
		String el = "a";
		jdbcTemplate.update(" call sp_eliminar(?)", el);
		System.out.println("primeoro");
		return jdbcTemplate.update("call pkg_cronograma_bus.sp_insert_crono(?)", cb.getId_mes());
	}
	
	
	@Override
	public Map<String, Object> readperido() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_listar_periodo").withCatalogName("pkg_cronograma_bus")
				.declareParameters(new SqlOutParameter("peri", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	
	
	@Override
	public Map<String, Object> readAll( int periodo) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_listar").withCatalogName("pkg_cronograma_bus")
				.declareParameters(new SqlOutParameter("lis_cro", OracleTypes.CURSOR, new ColumnMapRowMapper()), 
						new SqlParameter("periodo", Types.INTEGER));
		//SqlParameterSource in = new MapSqlParameterSource().addValue("para", paradero);
		SqlParameterSource in = new MapSqlParameterSource().addValue("periodo", periodo);
		
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAllC(int periodo) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("sp_listarC").withCatalogName("pkg_cronograma_bus")
				.declareParameters(new SqlOutParameter("lis_croci", OracleTypes.CURSOR, new ColumnMapRowMapper()), 
						new SqlParameter("periodo", Types.INTEGER));
		//SqlParameterSource in = new MapSqlParameterSource().addValue("para", paradero);
		SqlParameterSource in = new MapSqlParameterSource().addValue("periodo", periodo);
		return simpleJdbcCall.execute(in);
	}

}
