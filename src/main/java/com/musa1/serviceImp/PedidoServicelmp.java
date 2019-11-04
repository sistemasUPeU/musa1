package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.PedidoDao;
import com.musa1.entity.Pedido;
import com.musa1.service.PedidoService;

@Service
public class PedidoServicelmp implements PedidoService{
	@Autowired
	private PedidoDao pedidoDao;

	@Override
	public int create(Pedido pedido) {
		// TODO Auto-generated method stub
		return pedidoDao.create(pedido);
	}

	@Override
	public int edit(Pedido pedido) {
		// TODO Auto-generated method stub
		return pedidoDao.edit(pedido);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return pedidoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return pedidoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return pedidoDao.readAll();
	}
	
	
}
