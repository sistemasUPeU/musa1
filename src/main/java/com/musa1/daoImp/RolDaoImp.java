package com.musa1.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.RolDao;
import com.musa1.entity.OpcionRol;
import com.musa1.entity.Rol;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class RolDaoImp implements RolDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Rol rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addOpcionRol(OpcionRol opcionRol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Rol rol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_ROL").withCatalogName("pkg_crud_rol")
				.declareParameters(new SqlOutParameter("rols", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
