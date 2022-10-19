package com.colsubsidio.sap.apigee;

import java.lang.reflect.Array;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import netscape.javascript.JSObject;
//

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class ApigeeAfiliadoResDTO {
	    private int estado;
	    private String mensaje;
//	    @JsonProperty("data")
	    private List<ApigeeDataResDTO> data;
@Override

		public String toString() {
			return " {\"estado\": " + estado + ", \"mensaje\": " + mensaje + ", \"data\": " + data + "}";
		}
	
	    
	    

	    
	    
	    
	    
}
