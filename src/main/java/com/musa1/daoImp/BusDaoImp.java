package com.musa1.daoImp;

import java.sql.Types;
import java.util.List;
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

import com.musa1.dao.BusDao;
import com.musa1.entity.Bus;

import oracle.jdbc.OracleTypes;
@Repository
public class BusDaoImp implements BusDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Bus b) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_bus.sp_insert_bus(?,?,?,?,?,?,?,?,?,?,?)",b.getId_persona_propietario(),b.getMarca(),b.getPlaca(),b.getDescripcion(),b.getPadron(),b.getEstado(),b.getModelo(),b.getAño_fabricacion(),b.getNro_serie(),b.getNro_asientos());
	}

	@Override
	public int update(Bus b) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_bus.sp_update_bus(?,?,?,?,?,?,?,?,?,?,?");
		
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_bus.sp_delete_bus(?,?,?,?,?,?,?,?,?,?,?",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_BUS").withCatalogName("pkg_crud_bus")
				.declareParameters(new SqlOutParameter("bus",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("plac",Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("plac", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_BUS").withCatalogName("pkg_crud_bus")
				.declareParameters(new SqlOutParameter("b", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
}