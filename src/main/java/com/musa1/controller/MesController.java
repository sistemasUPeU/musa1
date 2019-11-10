package com.musa1.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.service.MesService;

@RestController
@RequestMapping("/mes")
public class MesController {
	
	@Autowired
	private MesService mesService;
	
	@GetMapping
	public Map<String, Object> get(){
		return mesService.readAll();
	}

}
