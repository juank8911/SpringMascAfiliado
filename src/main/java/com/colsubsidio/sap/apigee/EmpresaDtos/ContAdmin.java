package com.colsubsidio.sap.apigee.EmpresaDtos;

import java.sql.Date;

import com.colsubsidio.sap.apigee.afiliado.direccionAfiliadoResDto;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class ContAdmin {
	
	private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
	@Override
	public String toString() {
		return "{"+"  \"tipoDocumento\": " + tipoDocumento + ", \"numeroDocumento\": " + numeroDocumento + ", \"nombre\": "
				+ nombre + "  }";
	}
    
    

}
