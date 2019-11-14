package com.musa1.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.musa1.entity.Usuario;
import com.musa1.entity.UsuarioRol;
import com.musa1.service.SeguridadService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/seguridad")

public class SeguridadController {
	@Autowired
	private SeguridadService seguridadService;
	@GetMapping("/")
	public Map<String, Object>get(){
		return seguridadService.readUsuarios();
	}
	@PostMapping("/add")
	public Map<String, Object> create(@RequestBody Usuario usuario) {
		return seguridadService.createUser(usuario);
	}
	@PostMapping("/add/rol")
	public int giveRol(@RequestBody UsuarioRol usuarioRol) {
		return seguridadService.giveRol(usuarioRol);
	}
	@PostMapping("/validar")
	public Map<String, Object> validar(@RequestBody Usuario usuario) {
		return  seguridadService.validarUser(usuario.getNom_usuario(), usuario.getContrasena());
	}
}
