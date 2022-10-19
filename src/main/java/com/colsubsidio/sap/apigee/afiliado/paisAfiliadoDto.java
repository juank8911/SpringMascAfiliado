package com.colsubsidio.sap.apigee.afiliado;

import com.colsubsidio.sap.apigee.ApigeeAfilResDto;
import com.colsubsidio.sap.apigee.ApigeeDataResDTO;

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
public class paisAfiliadoDto {
	
	private String id;
	private String nombre;
	
	@Override
	public String toString() {
		return "{"+ "\"id\": " + id + ", \"nombre\": " + nombre + "}";
	}
	
	

}
