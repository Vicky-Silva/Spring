package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/hello")
@RestController
public class HelloController {

	@GetMapping
	public String hello () {
		return "Hello world";
	}
	@GetMapping("/Mentalidades")
	public String mentalidades() {
		return "percistencia comunicaçao";
	}
	@GetMapping("/objetivos")
	public String objetivos () {
		return "Aprendre spring e banco de dados";
	}
}


