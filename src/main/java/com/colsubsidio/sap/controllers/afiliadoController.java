package com.colsubsidio.sap.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.colsubsidio.sap.service.TokenService;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class afiliadoController {
	
//	@Value("${apigee.token.url}")
	private String urlApi = "https://colsubsidio-test.apigee.net";
	
//	  @Value("${apigee.token.url}")
		private String auth = "/oauth/client_credential/accesstoken";
		private String clienteId= "5A0amJxdlqDKntk1HbMAW7IxNrOW2026";
		private String clienteSecreto= "A3Wtl1gzqXUcM5rQ";
	
		
	@GetMapping("/afiliados")
	public String getAfiliados()
	{
		System.out.println("prueba de token");
		TokenService tk = new TokenService();
		String tok = tk.getToken();
		String uri = "https://jsonplaceholder.typicode.com/posts";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return tok;
	}
	
	@GetMapping("/afiliado")
	public String getAfiliado()
	{
		
		String uri = "https://jsonplaceholder.typicode.com/posts/1";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	
	

}
