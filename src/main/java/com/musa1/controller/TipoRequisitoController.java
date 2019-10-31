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

import com.musa1.entity.TipoRequisito;
import com.musa1.service.TipoRequisitoService;

@RestController
@RequestMapping("/tipoRequisito")
public class TipoRequisitoController {
	@Autowired
	private TipoRequisitoService tipoRequisitoService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return tipoRequisitoService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody TipoRequisito tipoRequisito) {
		return tipoRequisitoService.create(tipoRequisito);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipoRequisitoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipoRequisitoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody TipoRequisito tipoRequisito, @PathVariable int id) {
		tipoRequisito.setId_tipo_requisito(id);
		return tipoRequisitoService.edit(tipoRequisito);
	}
}
