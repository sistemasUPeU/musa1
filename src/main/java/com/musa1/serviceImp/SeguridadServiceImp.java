package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.SeguridadDao;
import com.musa1.entity.Usuario;
import com.musa1.entity.UsuarioRol;
import com.musa1.service.SeguridadService;

@Service
public class SeguridadServiceImp implements SeguridadService {
	@Autowired
	private SeguridadDao seguridadDao;	
	@Override
	public Map<String, Object> createUser(Usuario usuario) {
		// TODO Auto-generated method stub
		return seguridadDao.createUser(usuario);
	}

	@Override
	public int updatePassword(Usuario usuario) {
		// TODO Auto-generated method stub
		return seguridadDao.updatePassword(usuario);
	}

	@Override
	public int giveRol(UsuarioRol usuarioRol) {
		// TODO Auto-generated method stub
		return seguridadDao.giveRol(usuarioRol);
	}

	@Override
	public Usuario validateUser(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readUsuarios() {
		// TODO Auto-generated method stub
		return seguridadDao.readUsuarios();
	}

}
