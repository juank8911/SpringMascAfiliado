package com.colsubsidio.sap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.colsubsidio.sap.apigee.ApigeeAfiliadoResDTO;
import com.colsubsidio.sap.apigee.EmpresaDtos.ApigeeEmpresaResDto;
import com.colsubsidio.sap.interfaz.IAfiliado;
import com.colsubsidio.sap.interfaz.IToken;
import com.google.gson.Gson;

@Service
public class AfiliadoServcie implements IAfiliado {
	
	@Autowired
	private IToken tk;
	
	//private TokenService tk = new TokenService();
//	private String urlApi = "https://colsubsidio-test.apigee.net";
	private String urlApi = "https://colsubsidio-prod.apigee.net";
	private String UrlAf = "/api/v2/afiliacion/validador";
	private String UrlEm = "/api/v2/afiliaciones/validadorempresas";
	
	
	@Override
	public ApigeeAfiliadoResDTO Apigafiliado(String tipoid, String numeroId) {
		
		RestTemplate restTemlete = new RestTemplate();
		restTemlete.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		UriComponentsBuilder url = UriComponentsBuilder.fromHttpUrl(urlApi+UrlAf+"?tipoId="+tipoid+"&numeroId="+numeroId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccessControlAllowCredentials(true);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(tk.getToken());
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<ApigeeAfiliadoResDTO> result =
								restTemlete.exchange(url.toUriString(),HttpMethod.GET,entity,ApigeeAfiliadoResDTO.class);
//		mapeo(result);
//		System.out.println(result.toString());
		return result.getBody();
	}
	
	//
	//tipo de id es CO1N
	@Override
	public ApigeeEmpresaResDto apiEmpresa(String numeroId)
	{
		RestTemplate restTemlete = new RestTemplate();
		restTemlete.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		UriComponentsBuilder url = UriComponentsBuilder.fromHttpUrl(urlApi+UrlEm+"?tipoId=CO1N"+"&numeroId="+numeroId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccessControlAllowCredentials(true);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(tk.getToken());
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<ApigeeEmpresaResDto> result =
								restTemlete.exchange(url.toUriString(),HttpMethod.GET,entity,ApigeeEmpresaResDto.class);
		return result.getBody();
	}
	
	

}
