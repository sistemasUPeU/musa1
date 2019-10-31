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

import com.musa1.entity.TipoVinculacion;
import com.musa1.service.TipoVinculacionService;

@RestController
@RequestMapping("/tipo_vinculacion")
public class TipoVinculacionController {
	@Autowired
	private TipoVinculacionService tipoVinculacionService;
	
	@GetMapping("/")
	public Map<String, Object> get() {
		return tipoVinculacionService.readAll();
	}
	@PostMapping("/add")
	public int save(@RequestBody TipoVinculacion tipoVinculacion) {
		return tipoVinculacionService.create(tipoVinculacion);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return tipoVinculacionService.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipoVinculacionService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody TipoVinculacion tipoVinculacion, @PathVariable int id) {
		tipoVinculacion.setId_tipo_vinculacion(id);
		return tipoVinculacionService.update(tipoVinculacion);
	}
}
