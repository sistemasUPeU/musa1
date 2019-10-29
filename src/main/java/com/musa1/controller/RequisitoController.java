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

import com.musa1.entity.Requisito;
import com.musa1.service.RequisitoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/requisito")
public class RequisitoController {
	@Autowired
	private RequisitoService requisitoService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return requisitoService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Requisito requisito) {
		return requisitoService.create(requisito);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return requisitoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return requisitoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Requisito requisito, @PathVariable int id) {
		requisito.setId_requisito(id);
		return requisitoService.update(requisito);
	}
	@GetMapping("/conductor")
	public Map<String, Object> getRequisitoConductor() {
		return requisitoService.readRequisitoConductor();
	}
}
