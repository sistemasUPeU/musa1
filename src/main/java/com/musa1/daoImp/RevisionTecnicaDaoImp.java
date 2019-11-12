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

import com.musa1.dao.RevisionTecnicaDao;
import com.musa1.entity.RevisionTecnica;

import oracle.jdbc.internal.OracleTypes;


@Repository
public class RevisionTecnicaDaoImp implements RevisionTecnicaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_TECNICA.SP_INSERTAR_REVISION_TECNICA(?,?,?,?,?,?,?,?)",revisiontecnica.getFecha(),revisiontecnica.getEmpresa_de_revision(),revisiontecnica.getResultado_inspeccion(),revisiontecnica.getFecha_vigencia(),revisiontecnica.getUrl(),revisiontecnica.getObservacion(),revisiontecnica.getId_bus(),revisiontecnica.getNota());
	}

	@Override
	public int edit(RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_TECNICA.SP_MODIFICAR_REVISION_TECNICA(?,?,?,?,?,?,?,?,?,?,?)",revisiontecnica.getId_revision_tecnica(),revisiontecnica.getFecha(),revisiontecnica.getNro_certificado(),
				revisiontecnica.getEmpresa_de_revision(),revisiontecnica.getResultado_inspeccion(),revisiontecnica.getFecha_vigencia(),revisiontecnica.getUrl(),
				revisiontecnica.getObservacion(),revisiontecnica.getId_bus(),revisiontecnica.getId_persona(),revisiontecnica.getNota());
	}
	
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_CRUD_REVISION_TECNICA.SP_ELIMINAR_REVISION_TECNICA(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_REVISION_TECNICA").withCatalogName("PKG_CRUD_REVISION_TECNICA")
				.declareParameters(new SqlOutParameter("REV",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("RT_ID", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("RT_ID", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_REVISION_TECNICA").withCatalogName("PKG_CRUD_REVISION_TECNICA")
				.declareParameters(new SqlOutParameter("REV", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
