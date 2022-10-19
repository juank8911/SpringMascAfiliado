package com.colsubsidio.sap.apigee;

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
public class ApigeeDataResDTO {
	
	private ApigeeAfilResDto afiliado;
	private ApigeeEmpleadoresResDTO empleadores;
	@Override
	public String toString() {
		return "{"+"  \"afiliado\": " + afiliado + ", \"empleadores\": " + empleadores + "  }";
	}
	

	


	

}
