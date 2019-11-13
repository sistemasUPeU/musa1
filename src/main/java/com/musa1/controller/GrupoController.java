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

import com.musa1.entity.Grupo;
import com.musa1.service.GrupoService;
import com.musa1.service.MesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/grupo")
public class GrupoController {

	@Autowired
	private GrupoService grupoService;
	
	@Autowired 
	private MesService mesService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return mesService.readAll();
	}
	
	@GetMapping("/{tipoconsulta}")
	public Map<String, Object> getgrupo(@PathVariable int tipoconsulta){
		return grupoService.readAll(tipoconsulta);
	}
	
	
	@PostMapping("/add")
	public int create ( @RequestBody Grupo g) {
		System.out.println("grupo" + g);
		return grupoService.create(g);
	}
	
	@PutMapping("/{estado}")
	public int update( @RequestBody int g, @PathVariable int estado) {
		System.out.println("estado" + estado);
		System.out.println("body "+ g);
		return grupoService.update(estado);
	}
	
	@DeleteMapping("/all/{id}")
	public int deleteall( @PathVariable int id) {
		return grupoService.update(id);
	}
	@DeleteMapping("/{id}")
	public int delete( @PathVariable int id) {
		return grupoService.delete(id);
	}
	
}
