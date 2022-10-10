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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import reactor.core.publisher.Mono;

import com.colsubsidio.sap.apigee.ApigeeTokenReqDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenResDTO;
import com.colsubsidio.sap.apigee.ApigeeValidadorReq;
import com.colsubsidio.sap.service.TokenService;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class afiliadoController {
	
//	@Value("${apigee.token.url}")
	private String urlApi = "https://colsubsidio-test.apigee.net";
	private String urlafi = "/afiliacion/validador";
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

        /*** SELECCIONAS LA PAGINA QUE QUIERAS MOSTRAR ***/
        model.addAttribute("datos", "Estos son datos!!!");
        
        
       
        return "comun::" + uri.toString();
    }
	
	@GetMapping("/afiliado")
	public String getAfiliado()
	{
		
		String uri = "https://jsonplaceholder.typicode.com/posts/1";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		return result;
	}
	
	
	public Mono<String> obtainSecuredResource() {
	    Mono<String> resource = client.post()
	      .uri("localhost:8085/oauth/token")
	      .header("Authorization", "Basic " + {TOKEN_HERE})
	      .body(BodyInserters.fromFormData("grant_type", "client_credentials"))
	      .retrieve()
	      .bodyToMono(JsonNode.class)
	      .flatMap(tokenResponse -> {
	          String accessTokenValue = tokenResponse.get("access_token")
	            .textValue();
	          return client.get()
	            .uri("localhost:8084/retrieve-resource")
	            .headers(h -> h.setBearerAuth(accessTokenValue))
	            .retrieve()
	            .bodyToMono(String.class);
	        });
	    return resource.map(res ->
	      "Retrieved the resource using a manual approach: " + res);
	
	
	
	
	

}
