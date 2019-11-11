package com.musa1.daoImp;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.musa1.dao.SeguridadDao;
import com.musa1.entity.Usuario;
import com.musa1.entity.UsuarioRol;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class SeguridadDaoImp implements SeguridadDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> createUser(Usuario usuario) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_ADD_USUARIO").withCatalogName("PKG_SEGURIDAD")
				.declareParameters(new SqlParameter("nom_user", Types.VARCHAR), new SqlParameter("pass", Types.VARCHAR), new SqlParameter("cod_per", Types.VARCHAR), new SqlParameter("user_create", Types.VARCHAR), new SqlParameter("super_u", Types.VARCHAR), new SqlOutParameter("idu", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("nom_user", usuario.getNom_usuario()).addValue("pass", usuario.getContrasena()).addValue("cod_per", usuario.getCod_persona()).addValue("user_create", usuario.getUsuario_creacion()).addValue("super_u", usuario.getSuper_usuario());
		return simpleJdbcCall.execute(in);
	}
	@Override
	public int updatePassword(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int giveRol(UsuarioRol usuarioRol) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL PKG_SEGURIDAD.SP_ADD_USUARIO_ROL(?,?,?)",usuarioRol.getId_usuario(),usuarioRol.getId_rol(),usuarioRol.getFecha_v());
	}

	@Override
	public Map<String, Object> readUsuarios() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_READALL_USUARIO").withCatalogName("pkg_seguridad")
				.declareParameters(new SqlOutParameter("users", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
	@Override
	public Map<String, Object> validarUser(String nom_usuario, String contrasena) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_VALIDATE_USER").withCatalogName("PKG_SEGURIDAD")
				.declareParameters(new SqlParameter("nom_user", Types.VARCHAR), new SqlParameter("pass", Types.VARCHAR), new SqlOutParameter("usuario", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		SqlParameterSource in = new MapSqlParameterSource().addValue("nom_user", nom_usuario).addValue("pass", contrasena);
		System.out.println(nom_usuario+contrasena);
		return simpleJdbcCall.execute(in);
	}


}
