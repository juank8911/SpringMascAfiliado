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
	private DireccionEmpResDTO direccion;
<<<<<<< HEAD
	private String empresaPrincipal;
=======
	//
	//falta agregar la direccion al toString
	//
	private String empresaPrincipal;
	

>>>>>>> 8aaf2fb4eb0e9e939ad3ac04a23733983b3738ee
	@Override
	public String toString() {
		return "{"+"  \"bp\": " + bp + ", \"tipoDocumento\": " + tipoDocumento + ", \"numberoDocumento\": "
				+ numberoDocumento + ", \"nombre\": " + nombre + ", \"tipoAportante\": " + tipoAportante
				+ ", \"claserAportante\": " + claserAportante + ", \"fechaInicioActividad\": " + fechaInicioActividad
				+ ", \"fechaIngresoAfiliado\": " + fechaIngresoAfiliado + ", \"estado\": " + estado
				+ ", \"fechaInicioVigencia\": " + fechaInicioVigencia + ", \"fechaFinVigencia\": " + fechaFinVigencia
				+ ", \"salario\": " + salario + ", \"sucursal\": " + sucursal + ", \"telefono\": " + telefono
				+ ", \"localidad\": " + localidad + ", \"direccion\": " + direccion + ", \"empresaPrincipal\": "
				+ empresaPrincipal + "  }";
	}
	

	
	
	
	

	
	

}