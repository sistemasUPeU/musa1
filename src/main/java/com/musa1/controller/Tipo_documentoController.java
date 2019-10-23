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

import com.musa1.entity.Tipo_documento;
import com.musa1.service.Tipo_documentoService;

@RestController
@RequestMapping("/tipo_documento")
public class Tipo_documentoController {
	@Autowired
	private Tipo_documentoService tipo_documentoService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return tipo_documentoService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Tipo_documento tipo_documento) {
		return tipo_documentoService.create(tipo_documento);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipo_documentoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipo_documentoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Tipo_documento tipo_doc, @PathVariable int id) {
		tipo_doc.setId_tipo_documento(id);
		return tipo_documentoService.edit(tipo_doc);
	}
}
