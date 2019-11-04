package com.musa1.dao;

import java.util.Map;

import com.musa1.entity.Pedido;

public interface PedidoDao {
	public int create(Pedido pedido);
	public int edit (Pedido pedido);
	public int delete (int id);
	public Map<String , Object> read(int id);
	public Map<String , Object> readAll();
}
