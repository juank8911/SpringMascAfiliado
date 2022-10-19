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
	
	private String empresaPrincipal;
	private DepartamentoResDTO depEmp;
	private CiudadResDTO ciuEmp;
	
	@Override
	public String toString() {
		return "DireccionEmpResDTO [empresaPrincipal=" + empresaPrincipal + ", depEmp=" + depEmp + ", ciuEmp=" + ciuEmp
				+ "]";
	}
	
	

}
