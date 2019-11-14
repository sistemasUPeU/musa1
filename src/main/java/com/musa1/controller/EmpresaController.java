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

import com.musa1.entity.Empresa;
import com.musa1.service.EmpresaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping("/")
	public Map<String, Object> getall(){
		return empresaService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> getread(@PathVariable int id){
		return empresaService.read(id);
	}
	@PostMapping("/add")
	public int save(@RequestBody Empresa empresa) {
		return empresaService.create(empresa);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Empresa empresa, @PathVariable int id) {
		empresa.setId_empresa(id);
		return empresaService.update(empresa);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return empresaService.delete(id);
	}
}
