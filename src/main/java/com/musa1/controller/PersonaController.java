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

import com.musa1.entity.Persona;
import com.musa1.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public Map<String, Object> get() {
		return personaService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Persona persona) {
		return personaService.create(persona);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return personaService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return personaService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Persona per, @PathVariable int id) {
		per.setId_persona(id);
		return personaService.edit(per);
	}
}
