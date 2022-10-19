package com.colsubsidio.sap.apigee.afiliado;

import com.colsubsidio.sap.apigee.CiudadResDTO;
import com.colsubsidio.sap.apigee.DepartamentoResDTO;
import com.colsubsidio.sap.apigee.DireccionEmpResDTO;

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
public class AfilCuotaMonResDTO {
	
	private String tieneCuotaMonetaria;
	private String lugarEntrega;
    private String valorUltimoSubsidio;
    private String monto;
    
	@Override
	public String toString() {
		return "{"+ "\"tieneCuotaMonetaria\": " + tieneCuotaMonetaria + ", \"lugarEntrega\": " + lugarEntrega
				+ ", \"valorUltimoSubsidio\": " + valorUltimoSubsidio + ", \"monto\": " + monto + "\"  }";
	} 

}
