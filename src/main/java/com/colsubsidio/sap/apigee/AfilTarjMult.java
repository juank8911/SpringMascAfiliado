package com.colsubsidio.sap.apigee;

import java.util.List;

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
public class AfilTarjMult {
	
	private TarjMultMetPago metodoPago;
	private String lote;
	private String numeroTarjeta;
	private String gp;
	private String estado;
	private String fechaEntrega;
	private String estadoEntrega;
	private String fechaExpedicion;
	private String causaCambio;
	private String ultimoMesPagado;
	private String motivoBloqueo;
	private String serialProximidad;
	@Override
	public String toString() {
		return "{"+  "\"metodoPago\": " + metodoPago + ", \"lote\": " + lote + ", \"numeroTarjeta\": " + numeroTarjeta
				+ ", \"gp\": " + gp + ", \"estado\": " + estado + ", \"fechaEntrega\": " + fechaEntrega
				+ ", \"estadoEntrega\": " + estadoEntrega + ", \"fechaExpedicion\": " + fechaExpedicion
				+ ", \"causaCambio\": " + causaCambio + ", \"ultimoMesPagado\": " + ultimoMesPagado
				+ ", \"motivoBloqueo\": " + motivoBloqueo + ", \"serialProximidad\": " + serialProximidad + "}";
	}
	
	

}
