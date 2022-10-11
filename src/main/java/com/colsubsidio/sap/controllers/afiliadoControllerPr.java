package com.colsubsidio.sap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class afiliadoControllerPr {
	
	
	
@GetMapping("/prueba")
public Mono<String> verAfiliado()
{
	
	RestTemplate restTemplate = new RestTemplate();
//	restTemplate
	return null;
	
}

}
