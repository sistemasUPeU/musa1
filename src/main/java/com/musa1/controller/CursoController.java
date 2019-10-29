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

import com.musa1.entity.Curso;
import com.musa1.service.CursoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return cursoService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Curso curso) {
		return cursoService.create(curso);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return cursoService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return cursoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Curso cur, @PathVariable int id) {
		cur.setId_curso(id);
		return cursoService.edit(cur);
	}
}
