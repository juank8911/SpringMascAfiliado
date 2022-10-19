package com.colsubsidio.sap.apigee.EmpresaDtos;

import java.sql.Date;
import java.util.List;

import com.colsubsidio.sap.apigee.AfilTarjMult;
import com.colsubsidio.sap.apigee.ApigeeAfilResDto;
import com.colsubsidio.sap.apigee.afiliado.AfilCuotaMonResDTO;
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
public class EmpDetAportan {
	
	private String tipoContrato;
	private String descripcionContrato;
	private String claseInterlocutor;
	private String descripcionInterlocutor;
	private EmpEstad estado;
	private String numeroCotizantes;
	private String numeroConyuges;
	private String numeroPacs;
	private EmpRetiro retiro;
	private EmpModal modalidad;
	private EmpPago pago;
	private String ultimoCicloPagado;
	private String fechaInicioAporte;
	private String distribucionId;
	private String pagoAportesId;
	
	@Override
	public String toString() {
		return "{"+"  \"tipoContrato\": " + tipoContrato + ", \"descripcionContrato\": " + descripcionContrato
				+ ", \"claseInterlocutor\": " + claseInterlocutor + ", \"descripcionInterlocutor\": "
				+ descripcionInterlocutor + ", \"estado\": " + estado + ", \"numeroCotizantes\": " + numeroCotizantes
				+ ", \"numeroConyuges\": " + numeroConyuges + ", \"numeroPacs\": " + numeroPacs + ", \"retiro\": "
				+ retiro + ", \"modalidad\": " + modalidad + ", \"pago\": " + pago + ", \"ultimoCicloPagado\": "
				+ ultimoCicloPagado + ", \"fechaInicioAporte\": " + fechaInicioAporte + ", \"distribucionId\": "
				+ distribucionId + ", \"pagoAportesId\": " + pagoAportesId + "  }";
	}
	
	
	

}
