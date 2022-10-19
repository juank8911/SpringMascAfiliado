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
public class CompaniasResDTO {
	private String bp;
	private String tipoDocumento;
	private String numberoDocumento;
	private String nombre;
	private String tipoAportante;
	private String claserAportante;
	@JsonFormat(pattern = "yyyy-MM-dd")	   
	private Date fechaInicioActividad;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaIngresoAfiliado;
	private String estado;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaInicioVigencia;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaFinVigencia;
	private String salario;
	private String sucursal;
	private String telefono;
	private String localidad;
	private String empresaPrincipal;
	
	
	

}
