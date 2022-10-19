package com.colsubsidio.sap.apigee.EmpresaDtos;


import java.util.Date;
import java.util.List;

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
public class contriEmpResDTo {
	
	private String nombre;
    private String numeroDocumento;
    private String tipoDocumento;
    private EmprTeleResDto telefono;
    private direccionAfiliadoResDto direccion;
    private String direccionPrincipal;
    private String barrio;
    private String direccionSecundaria;
    private String correoElectronico;
    private String sitioWebEmpresa;
    private EmpRepLegal representanteLegal;
    private ContAdmin contactoAdministrador;
    private String nombreSujetoDerecho;
    private String formaJuridica;
    private EmpActEcono actividadEconomica;
    private EmpClase clase;
    private String leyMiPyme;
    
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaAfiliacion;
    
    private String idAlcaldia;
    private String idOficinaColsubsidio;
    private String localidad;
    private String tipoPersona;
    private String tipoContribuyente;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GTM+25")
    private Date fechaInicio;
//    private EmpDetAportan detalleAportantes;
    
	@Override
	public String toString() {
		return "{"+ " \"nombre\": " + nombre + ", \"numeroDocumento\": " + numeroDocumento + ", \"tipoDocumento\": "
				+ tipoDocumento + ", \"telefono\": " + telefono + ", \"direccion\": " + direccion
				+ ", \"direccionPrincipal\": " + direccionPrincipal + ", \"barrio\": " + barrio
				+ ", \"direccionSecundaria\": " + direccionSecundaria + ", \"correoElectronico\": " + correoElectronico
				+ ", \"sitioWebEmpresa\": " + sitioWebEmpresa + ", \"representanteLegal\": " + representanteLegal
				+ ", \"contactoAdministrador\": " + contactoAdministrador + ", \"nombreSujetoDerecho\": "
				+ nombreSujetoDerecho + ", \"formaJuridica\": " + formaJuridica + ", \"actividadEconomica\": "
				+ actividadEconomica + ", \"clase\": " + clase + ", \"leyMiPyme\": " + leyMiPyme
				+ ", \"fechaAfiliacion\": " + fechaAfiliacion + ", \"idAlcaldia\": " + idAlcaldia
				+ ", \"idOficinaColsubsidio\": " + idOficinaColsubsidio + ", \"localidad\": " + localidad
				+ ", \"tipoPersona\": " + tipoPersona + ", \"tipoContribuyente\": " + tipoContribuyente
				+ ", \"fechaInicio\": " + fechaInicio + "  }";
	}
    
    
    
    
    

    
    
	
    
    

}