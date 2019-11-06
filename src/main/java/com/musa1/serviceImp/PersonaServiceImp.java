package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.PersonaDao;
import com.musa1.entity.Persona;
import com.musa1.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaDao personaDao;
	
	@Override
	public int create(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.create(persona);
	}

	@Override
	public int edit(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.edit(persona);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}

	@Override
	public Map<String, Object> searchPersona(String nombre) {
		// TODO Auto-generated method stub
		return personaDao.searchPersona(nombre);
	}

}
