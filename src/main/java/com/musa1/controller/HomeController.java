package com.musa1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa1.service.PruebaService;



@RestController
@RequestMapping("/prueba")
public class HomeController {
  @Autowired
  PruebaService pruebaService;
  @GetMapping
  public String get() {
	  return pruebaService.listar("Proyecto Musa");
  }
}
