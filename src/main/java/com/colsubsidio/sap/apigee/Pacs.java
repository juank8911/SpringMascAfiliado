package com.colsubsidio.sap.apigee;

import java.util.Date;

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
public class Pacs {
	
	private String bp;
	private String tipoDocumento;
	private String numeroDocumento;
	private String primerNombre;
	private String segundoNombre;
	private String apellido;
	private String segundoApellido;
	private String edad;
	private String genero;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;
	private Relacion relacion;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaInicioVigencia;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaFinVigencia;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaRegistroRetiro;
	private String discapacidad;
	private Tarjeta tarjeta;
	private CuotaMonetaria cuotaMonetaria;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaLimiteComprobanteNutricional;
	private Documentacion documentacion;
	private String nivelEducativo;
	private String estado;
	private Validado validado;
	
	

}
