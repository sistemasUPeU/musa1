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
	public int agregar(@RequestBody Bus bus) {
		return busService.create(bus);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return busService.delete(id);
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id){
		return busService.read(id);
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody Bus bus, @PathVariable int id) {
		bus.setId_bus(id);
		return busService.update(bus);
	}
	
}