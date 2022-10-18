package com.colsubsidio.sap.interfaz;

import com.colsubsidio.sap.apigee.ApigeeAfiliadoResDTO;

public interface IAfiliado {
	
	public ApigeeAfiliadoResDTO Apigafiliado(String tipoid, String numeroId);
	public String apiEmpresa(String numeroId);
	
}
