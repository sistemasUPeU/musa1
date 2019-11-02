package com.musa1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.musa1.entity.Vinculacion;
import com.musa1.entity.VinculacionRequisito;
import com.musa1.service.BusService;
import com.musa1.service.PersonaService;
import com.musa1.service.RequisitoService;
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
	private RequisitoService requisitoService;
	@Autowired
	private BusService busService;
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/")
	public int jorge() {
		return 1;
	}

	@GetMapping("/conductor")
	public Map<String, Object> getVinculacionConductor() {
		return vinculacionService.readVinculacionConductor();
	}
	@PostMapping("/addvc")
	public int createVinculacionConductor(@RequestBody Vinculacion vinculacion) {
		int idv = (int)vinculacionService.createVinculacionConductor(vinculacion).get("idv");
		return idv;
	}
	
	@GetMapping("/bus")
	public Map<String, Object> ListarVistaVinculacionBus() {
		return vinculacionService.listarVistaVinculacionBus();
	}
	//mover
	@GetMapping("/bus/requisito")
	public Map<String, Object> ListarRequisitosBus(){
		return requisitoService.ListarRequisitoBus();
	}
	
	@GetMapping("/bus/requisito/{idv}")
	public Map<String, Object> ListarVinculacionRequisitoBus( @PathVariable int idv){
		return vinculacionRequisitoService.ListarVinculacionRequisito(idv);
	}
	
	@GetMapping("/bus/{placa}")
	public Map<String, Object> ListarVistaVinculacionBusPlaca(@PathVariable String placa) {
		return vinculacionService.listarVinculacionBusPlaca(placa);
	}
	
	@PostMapping("/bus")
	public int RegistrarVinculacionBus( @RequestBody Vinculacion v) {
		int idv = (int)vinculacionService.crearVinculacionBus(v).get("idv");
		return idv;
	}
	
	@PostMapping("/requisito")
	public int ModificarVinculacionRequisito(@RequestBody VinculacionRequisito e) {
		return vinculacionRequisitoService.modificarVinculacionRequisito(e);
	}
	
	@PutMapping("/bus/{idv}")
	public int RegistrarVinculacionRequisitoBus (@RequestBody VinculacionRequisito e, @PathVariable int idv) {
		return vinculacionRequisitoService.CrearRequisitoBus(e, idv);
	}
	
	@DeleteMapping("/bus/{idv}")
	public int EliminarVinculacionRequisitoBus(@PathVariable int idv) {
		return vinculacionService.eliminarVinculacionBus(idv);
	}
}
