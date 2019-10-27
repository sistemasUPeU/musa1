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

import com.musa1.entity.Curso_conductor;
import com.musa1.service.Curso_conductorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/curso_conductor")
public class Curso_conductorController {
	@Autowired
	private Curso_conductorService curso_conductorService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return curso_conductorService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Curso_conductor curso_conductor) {
		return curso_conductorService.create(curso_conductor);
	}
	@GetMapping("/{nombre}")
	public Map<String, Object> search(@PathVariable String nombre) {
		return curso_conductorService.searchCurso_conductor(nombre);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Curso_conductor cur, @PathVariable int id) {
		cur.setId_curso_conductor(id);
		return curso_conductorService.update(cur);
	}
}
