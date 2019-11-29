package com.musa1.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@CrossOrigin(origins = "*")
@RequestMapping("/upload2")
@Controller
@RestController
public class SoatUploadController {
	
	@GetMapping("/")
	public String probando() {
		return "funciona";
	}
	
	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes attributes) 
			throws IOException {
		if (file==null || file.isEmpty()) {
			attributes.addFlashAttribute("user.home", "Por favor seleccione el archivo");
			return "redirectstatus";
		}
		StringBuilder builder= new StringBuilder();
		builder.append(System.getProperty("user.home"));
		builder.append(File.separator);
		builder.append("file_upload");
		builder.append(file.getOriginalFilename());
		
		byte[] fileBytes = file.getBytes();
		Path path=Paths.get(builder.toString());
		Files.write(path, fileBytes);
		
		attributes.addFlashAttribute("message","Archivo cargaod correctamente ["+builder.toString()+"]");
		return "redirect:/status";
	}
	@GetMapping("/status")
	public String status() {
		return "status";
	}
	
	
}
