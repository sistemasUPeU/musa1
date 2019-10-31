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

import com.musa1.entity.TipoDocumento;
import com.musa1.service.TipoDocumentoService;

@RestController
@RequestMapping("/tipoDocumento")
public class TipoDocumentoController {
	@Autowired
	private TipoDocumentoService tipoDocumentoService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return tipoDocumentoService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody TipoDocumento tipoDocumento) {
		return tipoDocumentoService.create(tipoDocumento);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipoDocumentoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipoDocumentoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody TipoDocumento tipo_doc, @PathVariable int id) {
		tipo_doc.setId_tipo_documento(id);
		return tipoDocumentoService.edit(tipo_doc);
	}
}
