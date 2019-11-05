package com.musa1.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.RevisionDetalle;
import com.musa1.service.RevisionDetalleService;

@RestController
@RequestMapping("/revisiondetalle")
public class RevisionDetalleController {
	private RevisionDetalleService revisiondetalleService;

	@GetMapping("/")
	public Map<String, Object> get(){
		return revisiondetalleService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody RevisionDetalle revisiondetalle) {
		return revisiondetalleService.create(revisiondetalle);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return revisiondetalleService.delete(id);
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id){
		return revisiondetalleService.read(id);
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody RevisionDetalle rev, @PathVariable int id) {
		rev.setId_revision_detalle(id);
		return revisiondetalleService.update(rev);
	}
} 
