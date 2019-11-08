package com.musa1.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musa1.dao.ProductoDao;
import com.musa1.entity.Producto;
import com.musa1.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
	private ProductoDao productoDao;
	@Override
	public int create(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.create(producto);
	}

	@Override
	public int edit(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.edit(producto);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}


}
