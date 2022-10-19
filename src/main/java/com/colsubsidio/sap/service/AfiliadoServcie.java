package com.colsubsidio.sap.service;

import org.json.JSONObject;
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

import com.colsubsidio.sap.adapters.AfiliadoAdapter;
import com.colsubsidio.sap.interfaz.IAfiliado;
import com.colsubsidio.sap.interfaz.IToken;
import com.colsubsidio.sap.interfaz.ITransDatos;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;


import java.util.HashMap;

import lombok.Data;

import java.io.Console;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

@Service
public class AfiliadoServcie implements IAfiliado {
	
	@Autowired
	private IToken tk;
	
	@Autowired
	private ITransDatos ITraDat;


	//AfiliadoAdapter afAd;

	
	//private TokenService tk = new TokenService();
//	private String urlApi = "https://colsubsidio-test.apigee.net";
	private String urlApi = "https://colsubsidio-prod.apigee.net";
	private String UrlAf = "/api/v2/afiliacion/validador";
	private String UrlEm = "/api/v2/afiliaciones/validadorempresas";
	
	
	@Override
	public String Apigafiliado(String tipoid, String numeroId) {
		
		RestTemplate restTemlete = new RestTemplate();
		restTemlete.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		UriComponentsBuilder url = UriComponentsBuilder.fromHttpUrl(urlApi+UrlAf+"?tipoId="+tipoid+"&numeroId="+numeroId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccessControlAllowCredentials(true);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(tk.getToken());
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> result =
								restTemlete.exchange(url.toUriString(),HttpMethod.GET,entity,String.class);

		JSONObject jsonObject = new JSONObject(result.getBody());
		JsonArray jsonArr = new JsonArray();
		jsonArr.add(result.getBody());
//		 System.out.println("array: " + jsonArr);
		 
		JSONObject resp = ITraDat.transData(jsonObject);
		 //llamar a la clase nueva y su metodo
//		 recorrer con hasmap
//		 los datos en null = "";

		return resp.toString();

//		 y formato a las fechas
		 
		//return jsonArr.toString();
		
//		Data[0].afiliados.nombre =="null" ? Data[0].afiliados.nombre ="" : Data[0].afiliados.nombre=Data[0].afiliados.nombre; 


	}
	
	//
	//tipo de id es CO1N
	@Override
	public String apiEmpresa(String numeroId)
	{
		RestTemplate restTemlete = new RestTemplate();
		restTemlete.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		UriComponentsBuilder url = UriComponentsBuilder.fromHttpUrl(urlApi+UrlEm+"?tipoId=CO1N"+"&numeroId="+numeroId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccessControlAllowCredentials(true);
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(tk.getToken());
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> result =
								restTemlete.exchange(url.toUriString(),HttpMethod.GET,entity,String.class);		
		 JSONObject jsonObject = new JSONObject(result.getBody());
	 
		return jsonObject.toString();
	}
	

	
	public String converit(String afili)
	{
		Gson gson = new Gson();
		String afiliado = gson.toJson(afili);
		System.out.println(afiliado);
		return afiliado;

	}

}
