package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.CursoConductor;
import com.musa1.service.CursoConductorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/curso_conductor")
public class CursoConductorController {
	@Autowired
	private CursoConductorService cursoConductorService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return cursoConductorService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody CursoConductor cursoConductor) {
		return cursoConductorService.create(cursoConductor);
	}
	@GetMapping("/{nombre}")
	public Map<String, Object> search(@PathVariable String nombre) {
		return cursoConductorService.searchCursoConductor(nombre);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody CursoConductor cur, @PathVariable int id) {
		cur.setId_curso_conductor(id);
		return cursoConductorService.update(cur);
	}
}
