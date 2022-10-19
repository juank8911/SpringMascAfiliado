package com.colsubsidio.sap.apigee.EmpresaDtos;

public class contriEmpResDTo {
	
	private String nombre;
    private String numeroDocumento;
    private String tipoDocumento;
    private EmprTeleResDto telefono;
	@Override
	public String toString() {
		return "{"+  "\"nombre\": " + nombre + ", \"numeroDocumento\": " + numeroDocumento + ", \"tipoDocumento\": "
				+ tipoDocumento + ", \"telefono\": " + telefono + "  }";
	}
    
    

}
