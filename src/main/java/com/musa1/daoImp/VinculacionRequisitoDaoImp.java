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

import com.musa1.dao.VinculacionRequisitoDao;
import com.musa1.entity.Requisito;
import com.musa1.entity.VinculacionRequisito;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class VinculacionRequisitoDaoImp implements VinculacionRequisitoDao{

	@Autowired
	private JdbcTemplate jdbc;
	private SimpleJdbcCall call;
	
	
	@Override
	public int CrearRequisitoBus(VinculacionRequisito e) {
		
		return jdbc.update("CALL PKG_CRUD_VREQUISITO.sp_insert_vrequisito( ?, ?, ?, ?, NULL, ?)", e.getUrl(), e.getEstado(), e.getId_vinculacion(), e.getId_requisito(), e.getFecha_vencimiento_doc());
	}

	@Override
	public Map<String, Object> ListarVinculacionRequisito(int idv) {
		call = new SimpleJdbcCall(jdbc).withProcedureName("sp_listar_vrequisito").withCatalogName("CALL PKG_CRUD_VREQUISITO")
				.declareParameters(new SqlParameter("idv", Types.INTEGER), new SqlParameter("tr", Types.INTEGER), new SqlOutParameter("vrs", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idv", idv).addValue("tr", "Bus");
		return  call.execute(in);
	}
}
