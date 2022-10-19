package com.colsubsidio.sap.apigee;
import java.util.List;

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
public class ApigeeEmpleadoresResDTO {


		
	private String empleadoresConcurrentes;
	private List<CompaniasResDTO> companias;
	
	@Override
	public String toString() {
		return "{" + "\"empleadoresConcurrentes\": " + empleadoresConcurrentes + ", \"companias\": " + companias +"  }";
	}
	
	

		

		


		

	

}
