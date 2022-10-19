package com.colsubsidio.sap.apigee.afiliado;

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
public class afilAfiliacionResDto {
	
    
        private String fechaAfiliacion;
        private String categoria;
        private String grupo;
        private String tipoSalario;
        private String salario;
        private String salarioOtros;
        private String fechaRetiro;
        private String tipoCargo;
        private String horasLaboradas;
        private String tipoTrabajador;
        private String porcentajeAporte;
        private String subsidio;
        private AfilServicioResDto servicio;
        
		@Override
		public String toString() {
			return "{"+  "\"fechaAfiliacion\": " + fechaAfiliacion + ", \"categoria\": " + categoria + ", \"grupo\": "
					+ grupo + ", \"tipoSalario\": " + tipoSalario + ", \"salario\": " + salario + ", \"salarioOtros\": "
					+ salarioOtros + ", \"fechaRetiro\": " + fechaRetiro + ", \"tipoCargo\": " + tipoCargo
					+ ", \"horasLaboradas\": " + horasLaboradas + ", \"tipoTrabajador\": " + tipoTrabajador
					+ ", \"porcentajeAporte\": " + porcentajeAporte + ", \"subsidio\": " + subsidio + ", \"servicio\": "
					+ servicio + "}";
		}
        
        
        

    

}
