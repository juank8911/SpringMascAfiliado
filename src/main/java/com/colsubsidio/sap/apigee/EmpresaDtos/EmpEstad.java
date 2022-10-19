package com.colsubsidio.sap.apigee.EmpresaDtos;

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
public class EmpEstad {
	
	private String estadoId;
    private String fechaInicio;
    private String fechaFin;
	@Override
	public String toString() {
		return "{"+"  \"estadoId\": " + estadoId + ", \"fechaInicio\": " + fechaInicio + ", \"fechaFin\": " + fechaFin
				+ "  }";
	}
    
    

}
