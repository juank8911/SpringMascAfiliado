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
public class direccionAfiliadoResDto {
	
	private paisAfiliadoDto pais;
	private AfilDeptoResDtop departamento;
	private AfilCiudadResDto ciudad;
	private AfilLocalidadResDto localidad;

	@Override
	public String toString() {
		return "{"+ "\"pais\": " + pais + " }";
	}
	
	

}
