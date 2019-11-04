package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.Detalle_pedidoDao;
import com.musa1.entity.Detalle_pedido;
import com.musa1.service.Detalle_pedidoService;

@Service
public class Detalle_pedidoServicelmp implements Detalle_pedidoService{

	@Autowired
	private Detalle_pedidoDao detalle_pedidoDao;

	@Override
	public int create(Detalle_pedido detalle_pedido) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.create(detalle_pedido);
	}

	@Override
	public int update(Detalle_pedido detalle_pedido) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.update(detalle_pedido);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.readAll();
	}
	
	

}
