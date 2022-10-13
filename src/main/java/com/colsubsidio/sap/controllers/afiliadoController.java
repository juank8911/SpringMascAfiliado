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
public class afiliadoController {

	//cambiar a interface para consumir el servicio
	private AfiliadoServcie tok = new AfiliadoServcie();

		

	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/afiliado/{tipoid}/{numeroId}")
	public String getAfiliado(@PathVariable("tipoid") String tipoid,@PathVariable("numeroId") String numeroId)
	{
		System.out.println(tipoid+" / "+numeroId);
		String result =  tok.Apigafiliado(tipoid,numeroId);
		System.out.println(result);
		return result;
	}
	
	
	@GetMapping("/empresa/{numeroId}")
	public String getEmpresa(@PathVariable("numeroId")String numeroId)
	{
		//crear metodo para consumir de la api empresas
		return "yyyy";
	}
	
}
