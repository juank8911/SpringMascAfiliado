package com.colsubsidio.sap.controllers;


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

import com.colsubsidio.sap.apigee.ApigeeTokenReqDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenResDTO;
import com.colsubsidio.sap.apigee.ApigeeValidadorReq;
import com.colsubsidio.sap.service.AfiliadoServcie;
import com.colsubsidio.sap.service.TokenService;

import lombok.extern.slf4j.Slf4j;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class afiliadoController {
	
	private AfiliadoServcie tok = new AfiliadoServcie();
//	@Value("${apigee.token.url}")
	private String urlApi = "https://colsubsidio-test.apigee.net";
	private String urlafi = "/api/v2/afiliacion/validador";
//	  @Value("${apigee.token.url}")
		private String auth = "/oauth/client_credential/accesstoken";
		private String clienteId= "sD68JKGm4GeAb8lFva22v7OgCBSXfcbj";
		private String clienteSecreto= "9yXLfPgaxBAYEGSl";
		//newCode falta url app server
		final String urlServer="https://colsubsidio-test.apigee.net";
		
	@CrossOrigin(origins = "http://localhost:4200")	
	@GetMapping("/token")
	public String getAfiliados()
	{
		System.out.println("prueba de token");
		TokenService tk = new TokenService();
		String tok = tk.getToken();
//		String result = restTemplate.getForObject(urlApi+uri, String.class);
		System.out.println(tok);
		return tok;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("afiliadoss/{parametro}")
    public String paginaComun(@PathVariable("parametro") String parametro,
            ModelMap model) {
		
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        
        UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(urlApi+urlafi+"tipoId="+parametro+"&numeroId=1018497540");
        HttpHeaders headers = new HttpHeaders();
        TokenService tk = new TokenService();
        String url = urlApi+urlafi+"?tipoId="+parametro;
        headers.add(HttpHeaders.ACCEPT,"application/json");
        headers.add(HttpHeaders.AUTHORIZATION,"Bearer "+tk.getToken());
        HttpEntity<?> entity = new HttpEntity<Object>(headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        /*** SELECCIONAS LA PAGINA QUE QUIERAS MOSTRAR ***/
        model.addAttribute("datos", "Estos son datos!!!");
        	return url;
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/afiliado")
	public String getAfiliado()
	{
		
		String result =  tok.Apigafiliado();
		return result;
	}
	
	
	
	
		
	    //10/10/2022

		// agregar autorizacion token beaber a los headers para poder hacer la peticion 
		// solucionar Unable to identify proxy for host el error en postman
		@GetMapping("afiliacion/{tipoId}/{numeroId}")
		public Mono<ResponseEntity<Mono<String>>> testGet(@PathVariable("tipoId") String tipoId, @PathVariable("numeroId") String numeroId) {

			final long dateStarted = System.currentTimeMillis();
			//?/server
			WebClient webClient = WebClient.create(urlApi+urlafi);
			Mono<ClientResponse> respuesta = webClient.get().uri("?queryParam={name}", tipoId).exchangeToMono(null);
			Mono<ClientResponse> respuesta2 = webClient.get().uri("?queryParam={name}", numeroId).exchange();
			Mono<ClientResponse> respuesta1 = webClient.get().uri("?queryParam={name}","SPEED".equals(tipoId)?"SPEED":"STOP").exchange();
			Mono<ClientResponse> respuesta3 = webClient.get().uri("?queryParam={name}","SPEED".equals(numeroId)?"SPEED":"STOP").exchange();
			
			Mono<ResponseEntity<Mono<String>>> f1 = Mono.zip(respuesta, respuesta2, respuesta1, respuesta3)
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
}
