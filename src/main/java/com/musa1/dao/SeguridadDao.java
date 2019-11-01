package com.musa1.dao;

import com.musa1.entity.Usuario;
import com.musa1.entity.UsuarioRol;

public interface SeguridadDao {
	public int createUser(Usuario usuario);
	public Usuario validateUser(Usuario usuario);
	public int updatePassword(Usuario usuario);
	public int giveRol(UsuarioRol usuarioRol);
	
}
