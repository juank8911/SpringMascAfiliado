package com.colsubsidio.sap.apigee.afiliado;

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
public class AfilServicioResDto {
    
    private String nombre;

	@Override
	public String toString() {
		return "{" + "\"nombre\": " + nombre + "}";
	}
    
    
    
    

}
