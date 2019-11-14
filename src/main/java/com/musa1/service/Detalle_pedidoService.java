package com.musa1.service;

import java.util.Map;

import com.musa1.entity.Detalle_pedido;

public interface Detalle_pedidoService {
	public int create (Detalle_pedido detalle_pedido);
	public int update (Detalle_pedido detalle_pedido);
	public int delete (int id);
	public Map<String, Object> read(int id);
	public Map<String, Object> readAll();
	public Map<String, Object> read_detalle(int id);
}
