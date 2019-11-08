package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Usuario;
import com.musa1.entity.UsuarioRol;

public interface SeguridadDao {
	public Map<String, Object> readUsuarios();
	public Map<String, Object> createUser(Usuario usuario);
	public int updatePassword(Usuario usuario);
	public int giveRol(UsuarioRol usuarioRol);
	
}
