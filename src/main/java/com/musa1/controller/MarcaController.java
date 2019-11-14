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

import com.musa1.entity.Marca;
import com.musa1.service.MarcaService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/marca")
public class MarcaController {
	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return marcaService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Marca m) {
		return marcaService.create(m);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return marcaService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return marcaService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Marca m, @PathVariable int id) {
		m.setId_marca(id);
		return marcaService.update(m);
	}
}
