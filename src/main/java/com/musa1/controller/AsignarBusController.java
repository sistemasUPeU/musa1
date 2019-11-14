package com.musa1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.service.AsignarBusService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/asignarbus")
public class AsignarBusController {
  
	
	@Autowired
	private AsignarBusService service;
	
	@GetMapping("/list")
	public Map<String, Object> getAsignarBus() {
		return service.readAsignarBus();
	}
	
	@GetMapping("/paradero")
	public Map<String, Object> getParadero() {
	    return service.readParadero();
	}
}
