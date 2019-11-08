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

import com.musa1.entity.Producto;
import com.musa1.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return productoService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Producto producto) {
		return productoService.create(producto);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return productoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return productoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Producto prod, @PathVariable int id) {
		prod.setId_producto(id);
		return productoService.edit(prod);
	}
	
	
	
}
