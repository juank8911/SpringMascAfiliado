package com.colsubsidio.sap.apigee.EmpresaDtos;

public class EmprTeleResDto {
	
	private String fijo;
	private String celular;
	
	
	@Override
	public String toString() {
		return "{" +" \"fijo\": " + fijo + ", \"celular\": " + celular + "  }";
	}
	
	

}
