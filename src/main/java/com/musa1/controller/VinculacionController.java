package com.musa1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.entity.Requisito;
import com.musa1.entity.VW_Vinculacion;
import com.musa1.entity.Vinculacion;
import com.musa1.entity.VinculacionRequisito;
import com.musa1.service.RequisitoService;
import com.musa1.service.VW_VinculacionService;
import com.musa1.service.VinculacionRequisitoService;
import com.musa1.service.VinculacionService;

import oracle.jdbc.proxy.annotation.Post;

@RequestMapping("/vinculacion")
@RestController
public class VinculacionController {
	@Autowired
	private VinculacionService vinculacionService;
	@Autowired
	private VinculacionRequisitoService vinculacionRequisitoService;
	@Autowired
	private VW_VinculacionService vw_vinculacionService;
	@Autowired
	private RequisitoService requisitoService;
	
	@GetMapping("/")
	public int jorge() {
		return 1;
	}
	
	@PostMapping("/vinculacion-add")
	public int RegistrarVinculacion( @RequestBody Vinculacion v) {
		int idv = (int)vinculacionService.crearVinculacion(v).get("idv");
		return idv;
	}
	@PostMapping("/{idv}")
	public int RegistrarVinculacionRequisito (@RequestBody VinculacionRequisito e, @PathVariable int idv) {
		return vinculacionRequisitoService.CrearRequisitoBus(e, idv);
	}
	
	@GetMapping("/listar")
	public Map<String, Object> ListarVinculacion() {
		return vw_vinculacionService.readAll();
	}
	
	@GetMapping("/requisito-bus")
	public Map<String, Object> ListarRequisitosBus(){
		return requisitoService.ListarRequisitoBus();
	}
	
}
