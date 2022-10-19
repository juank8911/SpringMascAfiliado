package com.colsubsidio.sap.interfaz;

import com.colsubsidio.sap.apigee.ApigeeAfiliadoResDTO;
import com.colsubsidio.sap.apigee.EmpresaDtos.ApigeeEmpresaResDto;

public interface IAfiliado {
	
	public ApigeeAfiliadoResDTO Apigafiliado(String tipoid, String numeroId);
	
	public ApigeeEmpresaResDto apiEmpresa(String numeroId);
	
}
