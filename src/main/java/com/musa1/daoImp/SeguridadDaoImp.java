package com.musa1.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	public int validateUser(String user, String pass) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL PKG_SEGURIDAD.SP_VALIDATE_USER(?,?)",user,pass);
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


}
