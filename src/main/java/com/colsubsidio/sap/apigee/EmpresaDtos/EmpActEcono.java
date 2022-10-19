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
public class EmpActEcono {
	
	
	private String codigo;
    private String descripcion;
    private String agrupacion;
	@Override
	public String toString() {
		return "{"+"  \"codigo\": " + codigo + ", \"descripcion\": " + descripcion + ", \"agrupacion\": " + agrupacion
				+ "  }";
	}
    
    
    

}
