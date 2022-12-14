package com.colsubsidio.sap.service;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.colsubsidio.sap.apigee.ApigeeTokenReqDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenResDTO;


@Component
public class TokenService {

    //@Value("${apigee.url}")
    private String urlApi = "https://colsubsidio-test.apigee.net";
    
    //@Value("${apigee.token.url}")
	private String auth = "/oauth/client_credential/accesstoken";
    //@Value("${apigee.token.clienteId}")
    private String clienteId = "5A0amJxdlqDKntk1HbMAW7IxNrOW2026";
	//@Value("${apigee.token.clienteSecreto}")
	private String clienteSecreto = "A3Wtl1gzqXUcM5rQ";
	//@Value("${apigee.token.maxTimeInMillis}")
	private Long maxTimeInMillis = (long) 300000;
	
	

	//@Value("${apigee.path.logger}")
	private String logger = "/api/v1/tecnologia/logger";

	
	private String token;
	private LocalDateTime tokenDate;
	
	public String getToken() {
		if (token == null) {
			generateToken();
		} else {
            long tokenMillis = tokenDate.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long currMillis = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
			Long timeLive = currMillis - tokenMillis;
			if (timeLive > maxTimeInMillis) {
				generateToken();
			}
		}
		return token;
	}
	
	private void generateToken() {
		ApigeeTokenReqDTO request = new ApigeeTokenReqDTO();
		request.setClienteId(clienteId);
		request.setClienteSecreto(clienteSecreto);
		token = postAccessToken(request).getAccess_token();
		tokenDate = LocalDateTime.now();
	}
	
	public ApigeeTokenResDTO postAccessToken(ApigeeTokenReqDTO request) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        
        UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(urlApi+auth);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        HttpEntity<ApigeeTokenReqDTO> entity = new HttpEntity<ApigeeTokenReqDTO>(request, headers);
        
        ResponseEntity<ApigeeTokenResDTO> result = 
                restTemplate.exchange(uri.toUriString(), HttpMethod.POST, entity, ApigeeTokenResDTO.class);
        
        return result.getBody();
    }
	
//	public void sendToElasticSearch(LogElasticSearch log){
//		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Authorization", "Bearer " + this.getToken());
//		HttpEntity<LogElasticSearch> request = new HttpEntity<LogElasticSearch>(log,headers);
//		ResponseEntity<Object> response = restTemplate.exchange(urlApi+logger, HttpMethod.POST, request, Object.class);
//	}

}


