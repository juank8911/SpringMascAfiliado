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
public class CompaniasResDTO {
	private String bp;
	private String tipoDocumento;
	private String numberoDocumento;
	private String nombre;
	private String tipoAportante;
	private String claserAportante;
	private String fechaInicioActividad;
	private String fechaIngresoAfiliado;
	private String estado;
	private String fechaInicioVigencia;
	private String fechaFinVigencia;
	private String salario;
	private String sucursal;
	private String telefono;
	private String localidad;
	private DireccionEmpResDTO direccion;
	private String empresaPrincipal;
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
