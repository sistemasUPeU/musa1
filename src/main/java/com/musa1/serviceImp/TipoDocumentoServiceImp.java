package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.TipoDocumentoDao;
import com.musa1.entity.TipoDocumento;
import com.musa1.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImp implements TipoDocumentoService {
	@Autowired
	private TipoDocumentoDao tipoDocumentoDao;
	
	@Override
	public int create(TipoDocumento tipoDocumento) {
		// TODO Auto-generated method stub
		return tipoDocumentoDao.create(tipoDocumento);
	}

	@Override
	public int edit(TipoDocumento tipoDocumento) {
		// TODO Auto-generated method stub
		return tipoDocumentoDao.edit(tipoDocumento);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipoDocumentoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipoDocumentoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipoDocumentoDao.readAll();
	}

}
