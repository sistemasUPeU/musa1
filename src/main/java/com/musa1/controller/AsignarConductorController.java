package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.service.AsignarConductorService;

@CrossOrigin( origins = "http://localhost:4200")
@RestController
@RequestMapping("/asignarconductor")
public class AsignarConductorController {

	@Autowired
	private AsignarConductorService asignarConductorService;
	
	@GetMapping("/read")
	public Map<String, Object> getAsignarBus() {
		return asignarConductorService.readAsignarConductor();
	}
}
