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
		return jdbcTemplate.update("call pkg_crud_revision_tecnica.sp_insertar_revision_tecnica(?,?,?,?,?,?,?,?,?,?)",revisiontecnica.getFecha(),revisiontecnica.getNro_certificado(),
				revisiontecnica.getEmpresa_de_revision(),revisiontecnica.getResultado_inspeccion(),revisiontecnica.getVigencia_certificado(),revisiontecnica.getUrl(),
				revisiontecnica.getObservacion(),revisiontecnica.getId_bus(),revisiontecnica.getId_persona(),revisiontecnica.getNota());
	}

	@Override
	public int edit(RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_revision_tecnica.sp_modificar_revision_tecnica(?,?,?,?,?,?,?,?,?,?,?)",revisiontecnica.getId_revision_tecnica(),revisiontecnica.getFecha(),revisiontecnica.getNro_certificado(),
				revisiontecnica.getEmpresa_de_revision(),revisiontecnica.getResultado_inspeccion(),revisiontecnica.getVigencia_certificado(),revisiontecnica.getUrl(),
				revisiontecnica.getObservacion(),revisiontecnica.getId_bus(),revisiontecnica.getId_persona(),revisiontecnica.getNota());
	}
	
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pkg_crud_revision_tecnica.sp_revision_tecnica(?)",id);
	}

	@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("SP_READ_REVISION_TECNICA").withCatalogName("pkg_crud_revision_tecnica")
				.declareParameters(new SqlOutParameter("rev",OracleTypes
						.CURSOR,new ColumnMapRowMapper()), new SqlParameter("rt_id", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("rt_id", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_REVISION_TECNICA").withCatalogName("pkg_crud_revision_tecnica")
				.declareParameters(new SqlOutParameter("rev", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
