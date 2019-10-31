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

import com.musa1.entity.Tipo_requisito;
import com.musa1.service.Tipo_requisitoService;

@RestController
@RequestMapping("/tipo_requisito")
public class TipoRequisitoController {
	@Autowired
	private Tipo_requisitoService tipo_requisitoService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return tipo_requisitoService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Tipo_requisito tipo_requisito) {
		return tipo_requisitoService.create(tipo_requisito);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipo_requisitoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipo_requisitoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Tipo_requisito tipo_req, @PathVariable int id) {
		tipo_req.setId_tipo_requisito(id);
		return tipo_requisitoService.edit(tipo_req);
	}
}
