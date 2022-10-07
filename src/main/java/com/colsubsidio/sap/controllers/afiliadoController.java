package com.colsubsidio.sap.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class afiliadoController {
	
	@Value("${apigee.url}")
	private String urlApi;
	
	  @Value("${apigee.token.url}")
		private String auth;
	
	@GetMapping("/afiliados")
	public String getAfiliados()
	{
		String uri = "https://jsonplaceholder.typicode.com/posts";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	@GetMapping("/afiliado")
	public String getAfiliado()
	{
		
		String uri = "https://jsonplaceholder.typicode.com/posts/1";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	@PostMapping("/token")
	public String getToken()
	{
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(urlApi+auth, String.class);
		//crear el body de la peticioon con id client y client secrte
		
		return "token";
	}
	
	

}
