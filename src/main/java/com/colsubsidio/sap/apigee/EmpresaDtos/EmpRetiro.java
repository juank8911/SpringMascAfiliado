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
public class EmpRetiro {
	
	private String motivo;
    private String descripcion;
	@Override
	public String toString() {
		return "{"+"\"motivo\": " + motivo + ", \"descripcion\": " + descripcion + "  }";
	}
    
    

}
