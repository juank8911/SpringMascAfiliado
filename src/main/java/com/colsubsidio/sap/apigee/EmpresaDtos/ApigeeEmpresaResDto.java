package com.colsubsidio.sap.apigee.EmpresaDtos;

import java.util.List;

import com.colsubsidio.sap.apigee.ApigeeAfiliadoResDTO;
import com.colsubsidio.sap.apigee.ApigeeDataResDTO;

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
public class ApigeeEmpresaResDto {
	
	 private int estado;
	    private String mensaje;
//	    @JsonProperty("data")
	    private List<ApigeeDataEmpResDTO> data;
		@Override
		public String toString() {
			return "{"+  "\"estado\": " + estado + ", \"mensaje\": " + mensaje + ", \"data\": " + data + "  }";
		}
	    
	    

}
