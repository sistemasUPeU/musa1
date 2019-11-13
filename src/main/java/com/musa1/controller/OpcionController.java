package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.Opcion;
import com.musa1.service.OpcionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/opcion")
public class OpcionController {
	@Autowired
	private OpcionService opcionService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return opcionService.readAll();
	}
	@PostMapping("/add")
	public Map<String, Object> save(@RequestBody Opcion opcion) {
		return opcionService.create(opcion);
	}
}
