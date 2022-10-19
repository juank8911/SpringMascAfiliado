package com.colsubsidio.sap.apigee;


import java.util.Date;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class ApigeeAfiliadoResDTO {

	    private int estado;
	    private String mensaje;
	   	   
	    @JsonProperty("data.afiliado")
	    private String bp;
	    @JsonProperty("data.afiliado")
	    private String numeroDocumento;
	    @JsonProperty("data.afiliado")
	    private String tipoDocumento;
	    @JsonProperty("data.afiliado")
	    private String primerNombre;
	    @JsonProperty("data.afiliado")
	    private String segundoNombre;
	    @JsonProperty("data.afiliado")
	    private String primerApellido;
	    @JsonProperty("data.afiliado")
	    private String segundoApellido;
	    @JsonProperty("data.afiliado")
	    private String fechaNacimiento;
	    @JsonProperty("data.afiliado")
	    private String edad;
	    @JsonProperty("data.afiliado")
	    private String genero;
	    @JsonProperty("data.afiliado")
	    private String estadoCivil;
	    @JsonProperty("data.afiliado")
	    private String personasACargo;
	    @JsonProperty("data.afiliado")
	    private String nivelEducativo;
	    @JsonProperty("data.afiliado")
	    private String telefono;
	    @JsonProperty("data.afiliado")
	    private String motivoRetiro;
	    @JsonProperty("data.afiliado.direccion.pais")
	    private String pais_id;
	    @JsonProperty("data.afiliado.direccion.pais")
	    private String pais_nombre;
	    @JsonProperty("data.afiliado.direccion.departamento")
	    private String departamento_id;
	    @JsonProperty("data.afiliado.direccion.departamento")
	    private String departamento_nombre;
	    @JsonProperty("data.afiliado.direccion.ciudad")
	    private String ciudad_id;
	    @JsonProperty("data.afiliado.direccion.ciudad")
	    private String ciudad_nombre;
	    @JsonProperty("data.afiliado.direccion.localidad")
	    private String localidad_id;
	    @JsonProperty("data.afiliado.direccion")
	    private String direccionPrincipal;
	    @JsonProperty("data.afiliado.direccion")
	    private String direccionSecundaria;
	    @JsonProperty("data.afiliado.empresa.cargo")
	    private String descripcion;
	    @JsonProperty("data.afiliado.empresa")
	    private String simultaneas;
	    @JsonProperty("data.afiliado.alcaldia")
	    private String codigo;
	    @JsonProperty("data.afiliado")
	    private String tarifa;
	    @JsonProperty("data.afiliado")
	    private String estado_afil;
	    @JsonProperty("data.afiliado.afiliacion")
	   // @Temporal(TemporalType.DATE)
	    private String fechaAfiliacion;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String categoria;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String grupo;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String tipoSalario;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String salario;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String salarioOtros;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String fechaRetiro;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String tipoCargo;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String horasLaboradas;
	    @JsonProperty("data.afiliado.afiliacion")
	    private String tipoTrabajador;
	    @JsonProperty("data.afiliado.empleadores")
	    private String empleadoresConcurrentes;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String bp_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String tipoDocumento_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String numberoDocumento;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String nombre;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String tipoAportante;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String tipoPersona;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String claserAportante;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaInicioActividad;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String estado_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaIngresoAfiliado;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaInicioVigencia;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String fechaFinVigencia;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String salario_com;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String sucursal;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String agrupacion;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String localidad;
	    @JsonProperty("data.afiliado.empleadores.companias")
	    private String empresaPrincipal;
	    @JsonProperty("data.afiliado.pacs")
	    private String bp_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String tipoDocumento_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String numeroDocumento_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String primerNombre_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String segundoNombre_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String apellido_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String segundoApellido_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String edad_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String genero_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaNacimiento_pac;
	    @JsonProperty("data.afiliado.pacs.relacion")
	    private String codigo_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaInicioVigencia_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaFinVigencia_pac;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaRegistroRetiro;
	    @JsonProperty("data.afiliado.pacs")
	    private String discapacidad;
	    @JsonProperty("data.afiliado.pacs")
	    private String fechaLimiteComprobanteNutricional;
	    @JsonProperty("data.afiliado.pacs.documentacion")
	    private String motivoBloqueo;
	    @JsonProperty("data.afiliado.pacs.documentacion")
	    private String bloqueo;
	    @JsonProperty("data.afiliado.pacs.documentacion")
	    private String descripcionBloqueo;
	    @JsonProperty("data.afiliado.pacs.subsidio")
	    private String valor;
	    @JsonProperty("data.afiliado.pacs.subsidio")
	    private String tipoEntrega;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String primerNombre_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String segundoNombre_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String apellido;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.nombre")
	    private String segundoApellido_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.documento")
	    private String numero_doc_adm;
	    @JsonProperty("data.afiliado.pacs.subsidio.administrador.documento")
	    private String tipo_doc;
	    @JsonProperty("data.afiliado.pacs.tarjeta")
	    private String numero;
	    @JsonProperty("data.afiliado.pacs.tarjeta")
	    private String estado_tar_pac;
	    @JsonProperty("data.afiliado.pacs.tarjeta")
	    private String lote;
	    @JsonProperty("data.afiliado.pacs.cuotaMonetaria")
	    private String motivoBloqueo_cuo;
	    @JsonProperty("data.afiliado.pacs.cuotaMonetaria")
	    private String salario_cuo;
	    @JsonProperty("data.afiliado.pacs.cuotaMonetaria")
	    private String categoriaSalarial;
	    @JsonProperty("data.afiliado.pacs")
	    private String comprobanteNutricional;
	    @JsonProperty("data.afiliado.pacs")
	    private String nivelEducativo_pac;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String descripcion_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String nombre_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.documento")
	    private String numero_doc_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.documento")
	    private String tipo_doc_ins;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String fechaPersona;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String fechaRegistro;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String indicadorPersona;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String causaRetiro;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico")
	    private String descripcion_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String primerNombre_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String segundoNombre_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String apellido_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.nombre")
	    private String segundoApellido_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.documento")
	    private String numero_doc_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa.biologico.documento")
	    private String tipo_doc_bio;
	    @JsonProperty("data.afiliado.pacs.institucionEducativa")
	    private String estado_ins_pac;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String tieneCuotaMonetaria;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String lugarEntrega;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String valorUltimoSubsidio;
	    @JsonProperty("data.afiliado.cuotaMonetaria")
	    private String monto;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String lote_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String numeroTarjeta;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String serialProximidad;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String gp;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String estado_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String fechaEntrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String estadoEntrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String entrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String fechaExpedicion;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String causaCambio;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String ultimoMesPagado;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios")
	    private String motivoBloqueo_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.metodoPago")
	    private String id;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.metodoPago")
	    private String nombre_met_pag;
	   

	    
}
