
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

import com.musa1.entity.DetalleMantenimiento;
import com.musa1.entity.Mantenimiento;
import com.musa1.service.MantenimientoService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/mantenimiento")
public class MantenimientoController {
	@Autowired
	private MantenimientoService mantenimientoService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return mantenimientoService.readAll();
	}
	@GetMapping("/val2/3/")
	public Map<String,Object> getval2(){
		return mantenimientoService.readAllVal2();
	}
	@GetMapping("/bus/{padron}")
	public Map<String, Object> get_bus(@PathVariable String padron){
		return mantenimientoService.read_id_bus(padron);
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return mantenimientoService.read(id);
	}
	@GetMapping("/search/{nombre}")
	public Map<String, Object> search(@PathVariable String nombre) {
		return mantenimientoService.searchPadron(nombre);
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
	@PutMapping("/idman/{ide}")
	public int update_estado(@PathVariable("ide") int ide) {
		return mantenimientoService.update_estado(ide);
	}	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return mantenimientoService.delete(id);
	}
	
	@PutMapping("/observacion/{id}")
	public int update_observacion(@RequestBody Mantenimiento mantenimiento, @PathVariable int id) {
		mantenimiento.setId_mantenimiento(id);
		return mantenimientoService.update_observacion(mantenimiento);
	}
	
	@PutMapping("/estado_1/")
	public int update_validar_1(@RequestBody Mantenimiento mantenimiento) {
		return mantenimientoService.update_validar_1(mantenimiento);
	}
}
