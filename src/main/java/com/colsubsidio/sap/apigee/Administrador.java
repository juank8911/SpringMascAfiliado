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
public class Administrador {
	
	  private String tipoDocumento;
	  private String numeroDocumento;
	  private String primerNombre;
	  private String segundoNombre;
	  private String apellido;
	  private String segundoApellido;

}
