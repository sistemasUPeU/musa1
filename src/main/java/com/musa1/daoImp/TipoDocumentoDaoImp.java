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

import com.musa1.dao.TipoDocumentoDao;
import com.musa1.entity.TipoDocumento;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class TipoDocumentoDaoImp implements TipoDocumentoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(TipoDocumento tipoDocumento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_documento.sp_add_tipo_documento(?)",tipoDocumento.getNombre_documento());
	}

	@Override
	public int edit(TipoDocumento tipoDocumento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_documento.sp_update_tipo_documento(?)",tipoDocumento.getNombre_documento());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_tipo_documento.sp_delete_tipo_documento(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_TIPO_DOCUMENTO").withCatalogName("pkg_crud_tipo_documento")
				.declareParameters(new SqlOutParameter("tipo_doc", OracleTypes
						.CURSOR, new ColumnMapRowMapper()), new SqlParameter("iddoc", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("tipo_doc", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_TIPO_DOCUMENTO").withCatalogName("pkg_crud_tipo_documento")
				.declareParameters(new SqlOutParameter("tipo_doc", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
