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

import com.musa1.entity.Accion;
import com.musa1.service.AccionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/accion")
public class AccionController {
	@Autowired
	private AccionService accionService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return accionService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return accionService.read(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody Accion accion) {
		return accionService.create(accion);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Accion accion, @PathVariable int id) {
		accion.setId_accion(id);
		return accionService.update(accion);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return accionService.delete(id);
	}
	
}
