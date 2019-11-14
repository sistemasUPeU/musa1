package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.CronogramaBus;
import com.musa1.entity.Periodo;
import com.musa1.service.CronogramaService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/crono")
public class CronogramaController {
	
	@Autowired
	private CronogramaService cronogramaService;
	
	@GetMapping("/")
	public Map<String, Object> getperiodo(){
		return cronogramaService.readperido();
	}
	
	
	@GetMapping("/{para}/{peri}")
	public Map<String, Object> getcrono(@PathVariable  int para, @PathVariable int peri) {
		return cronogramaService.readAll(para, peri);
	}
	
	
	@PostMapping("/add")
	public int createcro( @RequestBody CronogramaBus cb) {
		System.out.println("estara llegando"+cb.getId_mes());
		return cronogramaService.create(cb);
	}
	
	@PutMapping("/{id}")
	public int update( @RequestBody Periodo p, @PathVariable int id) {
		p.setId_periodo(id);
		return cronogramaService.update(p);
	}
	
	@PostMapping("/crono")
	public int create(@RequestBody int a) {
		return cronogramaService.createcrono();
	}
	
	
	
	
	
}
