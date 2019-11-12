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

import com.musa1.entity.RevisionTecnica;
import com.musa1.service.RevisionTecnicaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/revisiontecnica")
public class RevisionTecnicaController {
	@Autowired
	
	private RevisionTecnicaService revisionTecnicaService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return revisionTecnicaService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody RevisionTecnica revisiontecnica) {
		return revisionTecnicaService.create(revisiontecnica);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return revisionTecnicaService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return revisionTecnicaService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody RevisionTecnica revisiontecnica  , @PathVariable int id) {
		revisiontecnica.setId_revision_tecnica(id);
		return revisionTecnicaService.edit(revisiontecnica);
	}
}
