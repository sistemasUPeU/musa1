package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.RequisitoDao;
import com.musa1.service.RequisitoService;

@Service
public class RequistoServiceImp implements RequisitoService{
	@Autowired
	private RequisitoDao dao;

	@Override
	public Map<String, Object> ListarRequisitoBus() {
		return dao.listarRequisitosBus();
	}
	
}
