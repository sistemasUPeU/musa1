package com.musa1.controller;

import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.musa1.entity.Bus;
import com.musa1.entity.VinculacionRequisito;
import com.musa1.service.BusService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	private BusService busService;
	private final Logger log = LoggerFactory.getLogger(BusController.class);
	
	@GetMapping("/")
	public Map<String, Object> get(){
		return busService.readAll();
	}
	
	@GetMapping("/buscar2")
	public Map<String, Object> get2(){
		return busService.read2();
	}
	
	
	@PostMapping("/addVin")
	public int agregarvin(@RequestBody VinculacionRequisito v) {
		return busService.createVin(v);
	}
	
	@PostMapping("/add")
	public int agregar(@RequestBody Bus b) {
		return busService.create(b);
	}
	
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return busService.delete(id);
	}
	
	@GetMapping("/{placa}")
	public Map<String, Object> read(@PathVariable String placa){
		return busService.read(placa);
	}
	
	@PutMapping("/{id}")
	public int update(@RequestBody Bus b, @PathVariable int id) {
		b.setId_bus(id);
		return busService.update(b);
	}
	
	
	
	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("archivo") MultipartFile archivo, @RequestParam("id") int id){
		Map<String, Object> response = new HashMap<>();
		
		VinculacionRequisito alum = new VinculacionRequisito();
		
		if(!archivo.isEmpty()) {
			String nombreArchivo = UUID.randomUUID().toString() + "_" +  archivo.getOriginalFilename().replace(" ", "");
			
			Path rutaArchivo = Paths.get("uploads").resolve(nombreArchivo).toAbsolutePath();
			log.info(rutaArchivo.toString());
			
			try {
				Files.copy(archivo.getInputStream(), rutaArchivo);
			} catch (IOException e) {
				response.put("mensaje", "Error al subir la imagen del alumno " + nombreArchivo);
				response.put("error", e.getMessage().concat(": ").concat(e.getCause().getMessage()));
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			String nombreFotoAnterior = alum.getUrl();
			
			if(nombreFotoAnterior !=null && nombreFotoAnterior.length() >0) {
				Path rutaFotoAnterior = Paths.get("uploads").resolve(nombreFotoAnterior).toAbsolutePath();
				File archivoFotoAnterior = rutaFotoAnterior.toFile();
				if(archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
					archivoFotoAnterior.delete();
				}
			}
			
			alum.setUrl(nombreArchivo);
			
			busService.createVin(alum);
			
			response.put("alumno", alum);
			response.put("mensaje", "Has subido correctamente la imagen: " + nombreArchivo);
			
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
	
}

