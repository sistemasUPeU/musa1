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
import com.musa1.entity.Mantenimiento;
import com.musa1.service.MantenimientoService;

@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {
	@Autowired
	private MantenimientoService mantenimientoService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return mantenimientoService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return mantenimientoService.read(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody Mantenimiento mantenimiento) {
		return mantenimientoService.create(mantenimiento);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Mantenimiento mantenimiento, @PathVariable int id) {
		mantenimiento.setId_mantenimiento(id);
		return mantenimientoService.update(mantenimiento);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return mantenimientoService.delete(id);
	}
}
