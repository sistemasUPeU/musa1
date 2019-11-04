package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.Usuario;
import com.musa1.service.SeguridadService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/seguridad")
public class SeguridadController {
	@Autowired
	private SeguridadService seguridadService;
	
	@PostMapping("/add")
	public Map<String, Object> create(@RequestBody Usuario usuario) {
		return seguridadService.createUser(usuario);
	}
	@GetMapping("/login")
	public Usuario login(@PathVariable String user) {
		return seguridadService.validateUser(user);
	}
}
