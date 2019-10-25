package com.musa1.daoImp;

import java.sql.Types;
import java.util.Map;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.CursoDao;
import com.musa1.entity.Curso;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class CursoDaoImp implements CursoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Curso curso) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_curso.sp_add_curso(?,?,?)",curso.getNombre_curso(),curso.getTiempo_vigencia(),curso.getEstado());
	}

	@Override
	public int edit(Curso curso) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_curso.sp_update_curso(?,?,?,?)",curso.getId_curso(),curso.getNombre_curso(),curso.getTiempo_vigencia(),curso.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_curso.sp_delete_curso(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_CURSO").withCatalogName("pkg_crud_curso")
				.declareParameters(new SqlOutParameter("cur", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idc", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idc", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_CURSO").withCatalogName("pkg_crud_curso")
				.declareParameters(new SqlOutParameter("cur", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
