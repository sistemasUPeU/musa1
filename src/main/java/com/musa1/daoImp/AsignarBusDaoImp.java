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

import com.musa1.dao.AsignarBusDao;
import com.musa1.entity.AsignarBus;
import com.musa1.entity.Curso;

import oracle.jdbc.OracleTypes;

@Repository
public class AsignarBusDaoImp implements AsignarBusDao{

	@Autowired
	private JdbcTemplate jdbc;
	private SimpleJdbcCall call;
	
	
	
	
	@Override
	public int edit(AsignarBus ab) {
		// TODO Auto-generated method stub
		//System.out.println("estoy llegando " + ab.getId_bus());
		return jdbc.update("call pkg_asignar_bus.update_asignarbus(?,?,?,?)",ab.getFijo(),ab.getId_paradero(),ab.getId_bus(),ab.getId_orden_grupo());
	}

	
	
	@Override
	public Map<String, Object> readAsignarBus() {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc)
				.withProcedureName("consult_asignar_bus").withCatalogName("pkg_asignar_bus")
				.declareParameters(new SqlOutParameter("CU", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

	@Override
	public Map<String, Object> readParadero() {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc)
				.withProcedureName("LIST_PARADERO").withCatalogName("pkg_asignar_bus")
				.declareParameters(new SqlOutParameter("LS", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return call.execute();
	}

	@Override
	public Map<String, Object> readfil(int nume) {
		// TODO Auto-generated method stub
		call = new SimpleJdbcCall(jdbc).withProcedureName("FILGRUPO").withCatalogName("pkg_asignar_bus")
				.declareParameters(new SqlOutParameter("Fil" , OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("nume", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("nume", nume);
		
		return call.execute(in);
	}

	

}
