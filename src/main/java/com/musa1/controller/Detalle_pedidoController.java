 package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.Detalle_pedido;
import com.musa1.service.Detalle_pedidoService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/detalle_pedido")
public class Detalle_pedidoController {

	@Autowired 
	private Detalle_pedidoService detalle_pedidoService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return detalle_pedidoService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return detalle_pedidoService.read_detalle(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody Detalle_pedido detalle_pedido) {
		return detalle_pedidoService.create(detalle_pedido);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Detalle_pedido detalle_pedido, @PathVariable int id) {
		detalle_pedido.setId_detalle_pedido(id);
		return detalle_pedidoService.update(detalle_pedido);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return detalle_pedidoService.delete(id);
	}
	
}
