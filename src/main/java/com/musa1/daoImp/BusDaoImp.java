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

import com.musa1.dao.BusDao;
import com.musa1.entity.Bus;
import com.musa1.entity.VinculacionRequisito;

import oracle.jdbc.OracleTypes;

@Repository
public class BusDaoImp implements BusDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Bus b) {
		return jdbcTemplate.update("call pkg_crud_bus.sp_insert_bus(?,?,?,?,?,?,?,?,?,?)",b.getMarca(),b.getPlaca(),b.getDescripcion(),b.getEstado(),b.getModelo(),b.getNro_motor(),b.getAnio_fabricacion(),b.getNro_serie(),b.getNro_asientos(),b.getId_persona_propietario());
	}

	@Override
	public int update(Bus b) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_bus.sp_update_bus(?,?,?,?,?,?,?,?,?,?)",b.getId_bus(),b.getMarca(),b.getPlaca(),b.getDescripcion(),b.getEstado(),b.getModelo(),b.getNro_motor(),b.getAnio_fabricacion(),b.getNro_serie(),b.getNro_asientos());
		
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_bus.sp_delete_bus(?)",id);
	}

	@Override
	public Map<String, Object> read(String placa) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_BUS").withCatalogName("pkg_crud_bus")
				.declareParameters(new SqlOutParameter("bus",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("plac",Types.VARCHAR));
				SqlParameterSource in = new MapSqlParameterSource().addValue("plac", placa);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READADLL_BUS").withCatalogName("pkg_crud_bus")
				.declareParameters(new SqlOutParameter("b", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public int createVin(VinculacionRequisito vr) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_bus.SP_INSERT_VINCUREQUE(?,?,?,?,?)",vr.getUrl(),vr.getEstado(),vr.getId_vinculacion(),vr.getId_requisito(),vr.getFecha_vencimiento_doc());
	}

	@Override
	public Map<String, Object> read2() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTAR_R").withCatalogName("pkg_crud_bus")
				.declareParameters(new SqlOutParameter("tr", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public Map<String, Object> STC() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_LISTAR_STC").withCatalogName("pkg_crud_bus")
				.declareParameters(new SqlOutParameter("STC", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public int delete2(int vr) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_bus.SP_DELETE_STC(?)",vr);
	}
	
}