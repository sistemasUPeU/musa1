package com.musa1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.musa1.service.VinculacionService;

@SpringBootTest
class Musa1ApplicationTests {
	
	//Agregar su servicio
	@Autowired
	private VinculacionService tVinculacion;

	@Test
	void contextLoads() {
		//Esto es un ejemplo no llenar
	}
	
	// Metodo para testear un servicio
	@Test
	void testListarVistaVinculacion() {
		assertTrue(!tVinculacion.listarVistaVinculacionBus().isEmpty());
	}

}
