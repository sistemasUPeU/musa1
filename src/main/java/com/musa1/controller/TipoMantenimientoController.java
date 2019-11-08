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

import com.musa1.entity.TipoMantenimiento;
import com.musa1.service.TipoMantenimientoService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/tipo_mantenimiento")

public class TipoMantenimientoController {
	@Autowired
	private TipoMantenimientoService tipo_mantenimientoService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return tipo_mantenimientoService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return tipo_mantenimientoService.read(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody TipoMantenimiento tipo_mantenimiento) {
		return tipo_mantenimientoService.create(tipo_mantenimiento);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody TipoMantenimiento tipo_mantenimiento, @PathVariable int id) {
		tipo_mantenimiento.setId_tipo_mantenimiento(id);
		return tipo_mantenimientoService.edit(tipo_mantenimiento);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipo_mantenimientoService.delete(id);
	}
}
