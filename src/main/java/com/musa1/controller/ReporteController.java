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

import com.musa1.entity.Reporte;
import com.musa1.service.ReporteService;
@RestController
@RequestMapping("/reporte")
public class ReporteController {

	@Autowired
	private ReporteService reporteService;
	
	@GetMapping("/")
	public Map<String , Object> getall(){
		return reporteService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String , Object> getread(@PathVariable int id){
		return reporteService.read(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody Reporte reporte) {
		return reporteService.create(reporte);
	}
	@PutMapping("{/id}")
	public int update(@RequestBody Reporte reporte, @PathVariable int id){
		reporte.setIdreporte(id);
		return reporteService.edit(reporte);
	}
	@DeleteMapping("/{id}")
	public int create(@PathVariable int id) {
		return reporteService.delete(id);
	}
	

}
