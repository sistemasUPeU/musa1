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

import com.musa1.entity.Tipo_vinculacion;
import com.musa1.service.Tipo_vinculacionService;

@RestController
@RequestMapping("/tipo_vinculacion")
public class Tipo_vinculacionController {
	@Autowired
	private Tipo_vinculacionService tipo_vinculacionService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return tipo_vinculacionService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Tipo_vinculacion tipo_vinculacion) {
		return tipo_vinculacionService.create(tipo_vinculacion);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipo_vinculacionService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipo_vinculacionService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Tipo_vinculacion tipo_vinculacion, @PathVariable int id) {
		tipo_vinculacion.setId_tipo_vinculacion(id);
		return tipo_vinculacionService.update(tipo_vinculacion);
	}
}
