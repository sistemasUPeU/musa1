package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Pedido;

public interface PedidoService {
	public int create (Pedido pedido);
	public int edit (Pedido pedido);
	public int delete(int id);
	public Map<String , Object> read(int id);
	public Map<String , Object> readAll();
	public int update_pedido(Pedido pedido);
	
}
