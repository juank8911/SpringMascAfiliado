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
public class DireccionEmpResDTO {
	
<<<<<<< HEAD
	
	private String ciudad;

=======
	private String direccionPrincipal;
	private DepartamentoResDTO departamento;
	private CiudadResDTO ciudad;
	
	//corregir toString
>>>>>>> 8aaf2fb4eb0e9e939ad3ac04a23733983b3738ee
	@Override
	public String toString() {
		return "{"+  "\"ciudad\": " + ciudad + "  }";
	}
	
	
	

}
