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
public class Validado {
	private String correo;
	private String celular;
	private String afiliado;
	private String segmento;
	private String rango;
	private String genero;
	private String estadoCivil;
	private String habeas;
	@JsonFormat(pattern = "yyyy-MM-dd")	   
	private Date fechaValidacion;	
	private Nombre nombre;
	private Direccion direccion;
	private Afiliacion afiliacion;
	private Empresa empresa;	

}
