package com.colsubsidio.sap.apigee.EmpresaDtos;

import java.sql.Date;

import com.colsubsidio.sap.apigee.afiliado.direccionAfiliadoResDto;
import com.fasterxml.jackson.annotation.JsonFormat;

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
public class EmpRepLegal {
	
	private String id;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String idPosicion;
	@Override
	public String toString() {
		return "{"+  "\"id\": " + id + ", \"tipoDocumento\": " + tipoDocumento + ", \"numeroDocumento\": "
				+ numeroDocumento + ", \"nombre\": " + nombre + ", \"primerNombre\": " + primerNombre
				+ ", \"segundoNombre\": " + segundoNombre + ", \"primerApellido\": " + primerApellido
				+ ", \"segundoApellido\": " + segundoApellido + ", \"idPosicion\": " + idPosicion + "  }";
	}
    
    
    

}
