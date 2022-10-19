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
public class Direccion {
	
	private String direccionPrincipal;

	@Override
	public String toString() {
		return "{"+  "\"direccionPrincipal\": " + direccionPrincipal + "  }";
	}
	
	

}
