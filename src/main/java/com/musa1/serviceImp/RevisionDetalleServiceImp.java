package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.RevisionDetalleDao;
import com.musa1.entity.RevisionDetalle;
import com.musa1.service.RevisionDetalleService;

@Service
public class RevisionDetalleServiceImp implements RevisionDetalleService{

	@Autowired
	private RevisionDetalleDao revisiondetalleDao;
	
	@Override
	public int create(RevisionDetalle revisiondetalle) {
		// TODO Auto-generated method stub
		return revisiondetalleDao.create(revisiondetalle);
	}

	@Override
	public int edit(RevisionDetalle revisiondetalle) {
		// TODO Auto-generated method stub
		return revisiondetalleDao.edit(revisiondetalle);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return revisiondetalleDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return revisiondetalleDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return revisiondetalleDao.readAll();
	}

}
