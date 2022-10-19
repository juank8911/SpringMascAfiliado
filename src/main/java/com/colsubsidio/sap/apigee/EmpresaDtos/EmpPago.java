package com.colsubsidio.sap.apigee.EmpresaDtos;

public class EmpPago {
	 private String via;
     private String descripcion;
	@Override
	public String toString() {
		return "{"+  "\"via\": " + via + ", \"descripcion\": " + descripcion + "  }";
	}
     
     

}
