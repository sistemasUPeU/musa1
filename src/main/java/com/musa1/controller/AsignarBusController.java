package com.musa1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.AsignarBus;
import com.musa1.entity.Curso;
import com.musa1.service.AsignarBusService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/asignarbus")
public class AsignarBusController {
  
	
	@Autowired
	private AsignarBusService service;
	
	@GetMapping("/list")
	public Map<String, Object> getAsignarBus() {
		return service.readAsignarBus();
	}
	
	@GetMapping("/paradero")
	public Map<String, Object> getParadero() {
	    return service.readParadero();
	}


	@PutMapping("/{id}")
	public int update(@RequestBody AsignarBus ab, @PathVariable int id) {
		ab.setId_detalle_bus_grupo(id);
		return service.edit(ab);
	}


	@GetMapping("/fil/{nume}")
	public Map<String, Object> getfil( @PathVariable int nume){
		return service.readfil(nume);

	}
}
