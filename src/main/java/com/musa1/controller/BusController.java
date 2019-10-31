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

import com.musa1.entity.Bus;
import com.musa1.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	private BusService busService;
	
	@GetMapping("/")
	public Map<String, Object> get(){
		return busService.readAll();
	}
	
	@PostMapping("/add")
	public int agregar(@RequestBody Bus b) {
		return busService.create(b);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return busService.delete(id);
	}
	
	@GetMapping("/{placa}")
	public Map<String, Object> read(@PathVariable String placa){
		return busService.read(placa);
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody Bus b, @PathVariable int id) {
		b.setId_bus(id);
		return busService.update(b);
	}
	
}