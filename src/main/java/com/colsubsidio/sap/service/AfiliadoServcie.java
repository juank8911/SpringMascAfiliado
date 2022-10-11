package com.colsubsidio.sap.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class AfiliadoServcie {
	
	private TokenService tk = new TokenService();
	private String urlApi = "https://colsubsidio-test.apigee.net";
	private String UrlAf = "/api/afiliacion/validador";
	
	public String Apigafiliado() {
		
		RestTemplate restTemlete = new RestTemplate();
		restTemlete.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		UriComponentsBuilder url = UriComponentsBuilder.fromHttpUrl("https://colsubsidio-test.apigee.net/api/v2/afiliacion/validador?tipoId=CO1C&numeroId=1018497540");
		
		  //Agrega Headers a la peticion 
		HttpHeaders headers = new HttpHeaders();
		headers.setAccessControlAllowCredentials(true);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(tk.getToken());
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> result =
								restTemlete.exchange(urlApi.toString(),HttpMethod.GET,entity,String.class);
		return result.getBody();
	}

}
