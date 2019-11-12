package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Usuario;
import com.musa1.entity.UsuarioRol;

public interface SeguridadService {
	public Map<String, Object> readUsuarios();
	public Map<String, Object> createUser(Usuario usuario);
	public Map<String, Object> validarUser(String user, String pass);
	public Usuario validateUser(String user);
	public int updatePassword(Usuario usuario);
	public int giveRol(UsuarioRol usuarioRol);
}
