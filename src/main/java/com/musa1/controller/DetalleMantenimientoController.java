package com.musa1.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.DetalleMantenimiento;
import com.musa1.service.DetalleMantenimientoService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/detalle_mantenimiento")
public class DetalleMantenimientoController {
	@Autowired
	private DetalleMantenimientoService detallemantenimientoService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return detallemantenimientoService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return detallemantenimientoService.read_detalle_ojito_mant(id);
	}
	
	@PostMapping("/add")
	public int save(@RequestBody DetalleMantenimiento detallemantenimiento) {
		return detallemantenimientoService.create(detallemantenimiento);
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody DetalleMantenimiento detallemantenimiento, @PathVariable int id) {
		detallemantenimiento.setId_detalle_accion_mant(id);
		return detallemantenimientoService.update(detallemantenimiento);
	}
	
	
	
	
}
