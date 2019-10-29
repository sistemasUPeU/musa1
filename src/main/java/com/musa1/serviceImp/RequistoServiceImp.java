package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.RequisitoDao;
import com.musa1.entity.Requisito;
import com.musa1.service.RequisitoService;

@Service
public class RequistoServiceImp implements RequisitoService{
	@Autowired
	private RequisitoDao dao;

	@Override
	public Map<String, Object> ListarRequisitoBus() {
		return dao.listarRequisitosBus();
	}

	@Override
	public int create(Requisito requisito) {
		// TODO Auto-generated method stub
		return dao.create(requisito);
	}

	@Override
	public int update(Requisito requisito) {
		// TODO Auto-generated method stub
		return dao.update(requisito);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

	@Override
	public Map<String, Object> readRequisitoConductor() {
		// TODO Auto-generated method stub
		return dao.readRequisitoConductor();
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}
	
}
