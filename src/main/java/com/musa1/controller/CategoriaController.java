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

import com.musa1.entity.Categoria;
import com.musa1.service.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	
	private CategoriaService categoriaService;
	
	@GetMapping("/")
	public Map<String, Object> get(){
		return categoriaService.readAll();
	}
	
	@PostMapping("/add")
	public int add(@RequestBody Categoria c) {
		return categoriaService.create(c);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return categoriaService.delete(id);
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody Categoria c , @PathVariable int id) {
		c.setId_categoria(id);
		return categoriaService.update(c);
	}
}

