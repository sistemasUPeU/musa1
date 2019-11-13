package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.Rol;
import com.musa1.service.RolService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rol")
public class RolController {
	@Autowired
	private RolService rolService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return rolService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody Rol rol) {
		return rolService.create(rol);
	}
}
