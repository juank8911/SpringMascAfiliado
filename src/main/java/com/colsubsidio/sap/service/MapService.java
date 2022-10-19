package com.colsubsidio.sap.service;

import java.util.HashMap;

import com.colsubsidio.sap.apigee.ApigeeAfiliadoResDTO;

public class MapService {
	private ApigeeAfiliadoResDTO afil;
	Iterator<String> keys = afil.has
	HashMap<ApigeeAfiliadoResDTO, String> afilMap = new HashMap
			                                              <ApigeeAfiliadoResDTO, String>();
	
	public ApigeeAfiliadoResDTO mapearAfi(){
		for (ApigeeAfiliadoResDTO i : afilMap.values() {
			  System.out.println(i);
			}
		
	}

}
