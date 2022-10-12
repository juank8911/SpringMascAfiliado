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

import com.colsubsidio.sap.apigee.ApigeeAfiliadoResDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenReqDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenResDTO;
import com.colsubsidio.sap.apigee.ApigeeValidadorReq;
import com.colsubsidio.sap.service.AfiliadoServcie;
import com.colsubsidio.sap.service.TokenService;

import lombok.extern.slf4j.Slf4j;




@RestController
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
	

	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/afiliado/{tipoid}/{numeroId}")
	public String getAfiliado(@PathVariable("tipoid") String tipoid,@PathVariable("numeroId") String numeroId)
	{
//		System.out.println(tipoid+" / "+numeroId);
		String result = tok.Apigafiliado((String) tipoid,numeroId);
		System.out.println("resultado //////////////");
		System.out.println(result);
		return result.toString();
	}
	
}
