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
public class ApigeeTokenReqDTO {

    private String clienteId;
	private String clienteSecreto;
	public String getClienteId() {
		return clienteId;
	}
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	public String getClienteSecreto() {
		return clienteSecreto;
	}
	public void setClienteSecreto(String clienteSecreto) {
		this.clienteSecreto = clienteSecreto;
	}
	
	
	
	

}