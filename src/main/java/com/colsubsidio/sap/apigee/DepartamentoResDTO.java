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
public class DepartamentoResDTO {
	
	private String codigo;

	@Override
	public String toString() {
		return "DepartamentoResDTO [codigo=" + codigo + "]";
	}
	
	

}
