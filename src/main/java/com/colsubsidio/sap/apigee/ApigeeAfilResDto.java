package com.colsubsidio.sap.apigee;

import java.sql.Date;
import java.util.List;

import com.colsubsidio.sap.apigee.afiliado.afilAfiliacionResDto;
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
    private String edad;
    private String genero;
    private String estadoCivil;
    private String personasACargo;
    private String nivelEducativo;
    private String telefono;
    private String motivoRetiro;
    private String estado;
    private String correoElectronico;
    private List<String> contacto;
    private direccionAfiliadoResDto direccion;
    private afilAfiliacionResDto afiliacion;

    private String direccionPrincipal;
    private String direccionSecundaria;
    
    
    
    
	@Override
	public String toString() {
		return "{"+"  \"bp\": " + bp + ", \"numeroDocumento\": " + numeroDocumento + ", \"tipoDocumento\": "
				+ tipoDocumento + ", \"primerNombre\": " + primerNombre + ", \"segundoNombre\": " + segundoNombre
				+ ", \"primerApellido\": " + primerApellido + ", \"segundoApellido\": " + segundoApellido
				+ ", \"fechaNacimiento\": " + fechaNacimiento + ", \"edad\": " + edad + ", \"genero\": " + genero
				+ ", \"estadoCivil\": " + estadoCivil + ", \"personasACargo\": " + personasACargo
				+ ", \"nivelEducativo\": " + nivelEducativo + ", \"telefono\": " + telefono + ", \"motivoRetiro\": "
				+ motivoRetiro + ", \"estado\": " + estado + ", \"correoElectronico\": " + correoElectronico
				+ ", \"contacto\": " + contacto + ", \"direccion\": " + direccion + ", \"afiliacion\": " + afiliacion
				+ ", \"direccionPrincipal\": " + direccionPrincipal + ", \"direccionSecundaria\": "
				+ direccionSecundaria +  "}";
	}
    
	
    

    
    

}
