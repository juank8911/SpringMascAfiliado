package com.colsubsidio.sap.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import reactor.core.publisher.Mono;

import com.colsubsidio.sap.apigee.ApigeeAfiliadoResDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenReqDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenResDTO;
import com.colsubsidio.sap.apigee.ApigeeValidadorReq;
import com.colsubsidio.sap.interfaz.IAfiliado;
import com.colsubsidio.sap.service.AfiliadoServcie;
import com.colsubsidio.sap.service.TokenService;

import lombok.extern.slf4j.Slf4j;




@RestController
<<<<<<< HEAD
public class afiliadoController {
=======
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class afiliadoController {
	
//	@Value("${apigee.token.url}")
	private String urlApi = "https://colsubsidio-test.apigee.net";
	private String urlafi = "/afiliacion/validador";
//	  @Value("${apigee.token.url}")
		private String auth = "/oauth/client_credential/accesstoken";
		private String clienteId= "5A0amJxdlqDKntk1HbMAW7IxNrOW2026";
		private String clienteSecreto= "A3Wtl1gzqXUcM5rQ";
		//newCode falta url app server
		final String urlServer="https://colsubsidio-test.apigee.net";
	
		
	@GetMapping("/afiliados")
	public String getAfiliados()
	{
		System.out.println("prueba de token");
		TokenService tk = new TokenService();
		String tok = tk.getToken();
		String uri = "?tipoId=CO1C&numeroId=1018497540";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(urlApi+uri, String.class);
		return result;
	}
	
	@GetMapping("afiliado/{parametro}")
    public String paginaComun(@PathVariable("parametro") String parametro,
            ModelMap model) {
		
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        
        UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(urlApi+urlafi+"tipoId="+parametro);
>>>>>>> main

	//cambiar a interface para consumir el servicio
	//private AfiliadoServcie tok = new AfiliadoServcie();
	
	@Autowired
	private IAfiliado afil;
	

	

	//cedula ej CO1C y 1018497540
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/afiliado/{tipoid}/{numeroId}")
	public String getAfiliado(@PathVariable("tipoid") String tipoid,@PathVariable("numeroId") String numeroId)
	{
		
//		System.out.println(tipoid+" / "+numeroId);
		String result =  afil.Apigafiliado(tipoid,numeroId);
//		System.out.println(result);
		return result.toString();
		
		
	}
	
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/empresa/{numeroId}")
	public String getEmpresa(@PathVariable("numeroId")String numeroId)
	{
		//crear metodo para consumir de la api empresas
	//String afiliado = afil.getEmpresaPrincipal();
//		System.out.println("/empresa / "+numeroId);
		String result =  afil.apiEmpresa(numeroId);
//		System.out.println(result);
		return result.toString();
	}
	
<<<<<<< HEAD

	
=======
		
	    //10/10/2022
		@GetMapping("/afiliado/validador/{tipoId}")
		public Mono<ResponseEntity<Mono<String>>> testGet(@PathVariable("tipoId") String tipoId) {
			final long dateStarted = System.currentTimeMillis();
			//?/server
			WebClient webClient = WebClient.create(urlApi+"/afiliacion/validador");
			Mono<ClientResponse> respuesta = webClient.get().uri("?queryParam={name}", tipoId).exchange();
			Mono<ClientResponse> respuesta1 = webClient.get().uri("?queryParam={name}","SPEED".equals(tipoId)?"SPEED":"STOP").exchange();
			
			Mono<ResponseEntity<Mono<String>>> f1 = Mono.zip(respuesta, respuesta1)
			.map(t -> {
				if (!t.getT1().statusCode().is2xxSuccessful()) {
					return ResponseEntity.status(t.getT1().statusCode()).body(t.getT1().bodyToMono(String.class));
				}
				if (!t.getT2().statusCode().is2xxSuccessful()) {
					return ResponseEntity.status(t.getT2().statusCode()).body(t.getT2().bodyToMono(String.class));
				}
				return ResponseEntity.ok().body(Mono.just(
						"All OK. Seconds elapsed: " + (((double) (System.currentTimeMillis() - dateStarted) / 1000))));
			});
			return f1;
		
	}
>>>>>>> main
}
