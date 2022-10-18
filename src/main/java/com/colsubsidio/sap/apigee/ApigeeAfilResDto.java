package com.colsubsidio.sap.apigee;

import java.sql.Date;

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
public class ApigeeAfilResDto {
	
	private int bp;
	private String numeroDocumento;
    private String tipoDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;
	@Override
	public String toString() {
		return " {\"bp\": " + bp + ", \"numeroDocumento\": " + numeroDocumento + ", \"tipoDocumento\": " + tipoDocumento
				+ ", \"primerNombre\": " + primerNombre + ", \"segundoNombre\": " + segundoNombre
				+ ", \"primerApellido\": " + primerApellido + ", \"segundoApellido\": " + segundoApellido
				+ ", \"fechaNacimiento\": " + fechaNacimiento + "\"}";
	}
    
	
    

    
    

}
