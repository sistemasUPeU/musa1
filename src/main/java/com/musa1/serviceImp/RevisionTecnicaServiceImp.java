package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.RevisionTecnicaDao;
import com.musa1.entity.RevisionTecnica;
import com.musa1.service.RevisionTecnicaService;

@Service
public class RevisionTecnicaServiceImp implements RevisionTecnicaService {
	@Autowired
	private RevisionTecnicaDao revisionTecnicaDao;
	
	@Override
	public int create(RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return revisionTecnicaDao.create(revisiontecnica);
	}

	@Override
	public int edit(RevisionTecnica revisiontecnica) {
		// TODO Auto-generated method stub
		return revisionTecnicaDao.edit(revisiontecnica);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return revisionTecnicaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return revisionTecnicaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return revisionTecnicaDao.readAll();
	}

	@Override
	public Map<String, Object> read_id_bus(String placa) {
		// TODO Auto-generated method stub
		return revisionTecnicaDao.read_id_bus(placa);
	}

}
