package com.colsubsidio.sap.interfaz;

import com.colsubsidio.sap.apigee.ApigeeTokenReqDTO;
import com.colsubsidio.sap.apigee.ApigeeTokenResDTO;

public interface IToken {
	
	public String getToken();
	public ApigeeTokenResDTO postAccessToken(ApigeeTokenReqDTO request);

}
