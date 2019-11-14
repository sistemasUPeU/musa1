package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.Pedido;
import com.musa1.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return pedidoService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return pedidoService.read(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody Pedido pedido) {
		return pedidoService.create(pedido);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Pedido pedido, @PathVariable int id) {
		pedido.setId_pedido(id);
		return pedidoService.edit(pedido);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return pedidoService.delete(id);
	}

	@PutMapping("/status/{id}")
	public int update_pedido(@RequestBody Pedido pedido, @PathVariable int id) {
		pedido.setId_pedido(id);
		return pedidoService.update_pedido(pedido);
	}
}
