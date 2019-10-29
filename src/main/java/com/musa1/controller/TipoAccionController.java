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

import com.musa1.entity.TipoAccion;
import com.musa1.service.TipoAccionService;

@RestController
@RequestMapping("/tipo_accion")
public class TipoAccionController {
	@Autowired
	private TipoAccionService tipo_accionService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return tipo_accionService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return tipo_accionService.read(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody TipoAccion tipo_accion) {
		return tipo_accionService.create(tipo_accion);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody TipoAccion tipo_accion, @PathVariable int id) {
		tipo_accion.setId_tipo_accion(id);
		return tipo_accionService.update(tipo_accion);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipo_accionService.delete(id);
	}

}






