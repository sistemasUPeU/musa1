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

import com.musa1.entity.Unidad_medida;
import com.musa1.service.Unidad_medidaService;

@RestController
@RequestMapping("/unidad_medida")
public class Unidad_medidaController {

	@Autowired
	public Unidad_medidaService unidad_medidaService;
	
	
	@GetMapping("/")
	public Map<String, Object> get(){
		return unidad_medidaService.readAll();	
	}
	
	@PostMapping("/add")
	public int save(@RequestBody Unidad_medida unidad_medida) {
		return unidad_medidaService.create(unidad_medida);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return unidad_medidaService.delete(id);
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id){
		return unidad_medidaService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Unidad_medida unidad_medida, @PathVariable int id) {
		unidad_medida.setId_unidad_medida(id);
		return unidad_medidaService.edit(unidad_medida);
	}
}
