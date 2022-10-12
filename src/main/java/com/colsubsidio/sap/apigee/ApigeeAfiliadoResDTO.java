package com.colsubsidio.sap.apigee;

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
	    private String estado;
	    private String mensaje;
	   	   
	    @JsonProperty("data.afiliado.bp")
	    private String bp;
	    @JsonProperty("data.afiliado.numeroDocumento")
	    private String numeroDocumento;
	    @JsonProperty("data.afiliado.tipoDocumento")
	    private String tipoDocumento;
	    @JsonProperty("data.afiliado.primerNombre")
	    private String primerNombre;
	    @JsonProperty("data.afiliado.segundoNombre")
	    private String segundoNombre;
	    @JsonProperty("data.afiliado.primerApellido")
	    private String primerApellido;
	    @JsonProperty("data.afiliado.segundoApellido")
	    private String segundoApellido;
	    @JsonProperty("data.afiliado.rol")
	    private String rol;
	    @JsonProperty("data.afiliado.caja")
	    private String caja;
	    @JsonProperty("data.afiliado.fechaNacimiento")
	    private String fechaNacimiento;
	    @JsonProperty("data.afiliado.edad")
	    private String edad;
	    @JsonProperty("data.afiliado.genero")
	    private String genero;
	    @JsonProperty("data.afiliado.estadoCivil")
	    private String estadoCivil;
	    @JsonProperty("data.afiliado.personasACargo")
	    private String personasACargo;
	    @JsonProperty("data.afiliado.nivelEducativo")
	    private String nivelEducativo;
	    @JsonProperty("data.afiliado.telefono")
	    private String telefono;
	    @JsonProperty("data.afiliado.motivoRetiro")
	    private String motivoRetiro;
	    @JsonProperty("data.afiliado.correoElectronico")
	    private String correoElectronico;
	    @JsonProperty("data.afiliado.contacto")
	    private String contacto;
	    @JsonProperty("data.afiliado.direccion.pais.id")
	    private String pais_id;
	    @JsonProperty("data.afiliado.direccion.pais.nombre")
	    private String pais_nombre;
	    @JsonProperty("data.afiliado.direccion.departamento.id")
	    private String departamento_id;
	    @JsonProperty("data.afiliado.direccion.departamento.nombre")
	    private String departamento_nombre;
	    @JsonProperty("data.afiliado.direccion.ciudad.id")
	    private String ciudad_id;
	    @JsonProperty("data.afiliado.direccion.ciudad.nombre")
	    private String ciudad_nombre;
	    @JsonProperty("data.afiliado.direccion.localidad.id")
	    private String localidad_id;
	    @JsonProperty("data.afiliado.direccion.localidad.nombre")
	    private String localidad_nombre;
	    @JsonProperty("data.afiliado.direccion.direccionPrincipal")
	    private String direccionPrincipal;
	    @JsonProperty("data.afiliado.direccion.direccionSecundaria")
	    private String direccionSecundaria;
	    @JsonProperty("data.afiliado.estado")
	    private String estado_afil;
	    @JsonProperty("data.afiliado.afiliacion.fechaAfiliacion")
	    private String fechaAfiliacion;	
	    @JsonProperty("data.afiliado.afiliacion.categoria")
	    private String categoria;
	    @JsonProperty("data.afiliado.afiliacion.grupo")
	    private String grupo;
	    @JsonProperty("data.afiliado.afiliacion.porcentajeAporte")
	    private String porcentajeAporte;
	    @JsonProperty("data.afiliado.afiliacion.subsidio")
	    private String subsidio;
	    @JsonProperty("data.afiliado.afiliacion.servicios.nombre")
	    private String nombre_ser;
	    @JsonProperty("data.afiliado.afiliacion.tipoSalario")
	    private String tipoSalario;
	    @JsonProperty("data.afiliado.afiliacion.salario")
	    private String salario;
	    @JsonProperty("data.afiliado.afiliacion.salarioOtros")
	    private String salarioOtros;
	    @JsonProperty("data.afiliado.afiliacion.fechaRetiro")
	    private String fechaRetiro;
	    @JsonProperty("data.afiliado.afiliacion.tipoCargo")
	    private String tipoCargo;
	    @JsonProperty("data.afiliado.afiliacion.horasLaboradas")
	    private String horasLaboradas;
	    @JsonProperty("data.afiliado.afiliacion.tipoTrabajador")
	    private String tipoTrabajador;
	    @JsonProperty("data.afiliado.cuotaMonetaria.tieneCuotaMonetaria")
	    private String tieneCuotaMonetaria;
	    @JsonProperty("data.afiliado.cuotaMonetaria.lugarEntrega")
	    private String lugarEntrega;
	    @JsonProperty("data.afiliado.cuotaMonetaria.valorUltimoSubsidio")
	    private String valorUltimoSubsidio;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.lote")
	    private String lote_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.numeroTarjeta")
	    private String numeroTarjeta;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.serialProximidad")
	    private String serialProximidad;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.gp")
	    private String gp;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.estado")
	    private String estado_tar;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.fechaEntrega")
	    private String fechaEntrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.estadoEntrega")
	    private String estadoEntrega;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.fechaExpedicion")
	    private String fechaExpedicion;	    
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.causaCambio")
	    private String causaCambio;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.ultimoMesPagado")
	    private String ultimoMesPagado;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.motivoBloqueo")
	    private String motivoBloqueo_tar;	    
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.metodoPago.id")
	    private String id_met_pag;
	    @JsonProperty("data.afiliado.tarjetaMultiservicios.metodoPago.nombre")
	    private String nom_met_pag;
	    
	    @JsonProperty("data.empleadores.empleadoresConcurrentes")
	    private String empleadoresConcurrentes;
	    @JsonProperty("data.empleadores.companias.bp")
	    private String bp_com;
	    @JsonProperty("data.empleadores.companias.tipoDocumento")
	    private String tipoDocumento_com;
	    @JsonProperty("data.empleadores.companias.numberoDocumento")
	    private String numberoDocumento;
	    @JsonProperty("data.empleadores.companias.nombre")
	    private String nombre_com;
	    @JsonProperty("data.empleadores.companias.tipoAportante")
	    private String tipoAportante;
	    @JsonProperty("data.empleadores.companias.claserAportante")
	    private String claserAportante;
	    @JsonProperty("data.empleadores.companias.fechaInicioActividad")
	    private String fechaInicioActividad;
	    @JsonProperty("data.empleadores.companias.estado")
	    private String estado_com;
	    @JsonProperty("data.empleadores.fechaIngresoAfiliado")
	    private String fechaIngresoAfiliado;
	    @JsonProperty("data.empleadores.companias.fechaInicioVigencia")
	    private String fechaInicioVigencia;
	    @JsonProperty("data.empleadores.companias.fechaFinVigencia")
	    private String fechaFinVigencia;
	    @JsonProperty("data.empleadores.companias.salario")
	    private String salario_com;
	    @JsonProperty("data.empleadores.companias.sucursal")
	    private String sucursal;
	    @JsonProperty("data.empleadores.companias.telefono")
	    private String telefono_com;
	    @JsonProperty("data.empleadores.companias.localidad")
	    private String localidad;
	    @JsonProperty("data.empleadores.companias.direccion.departamento.codigo")
	    private String codigo;
	    @JsonProperty("data.empleadores.companias.direccion.ciudad.codigo")
	    private String codigo_ciu;
	    @JsonProperty("data.empleadores.companias.direccion.direccionPrincipal")
	    private String direccionPrincipal_com;
	    @JsonProperty("data.empleadores.companias.empresaPrincipal")
	    private String empresaPrincipal;
	    
	    @JsonProperty("data.pacs.bp")
	    private String bp_pac;
	    @JsonProperty("data.pacs.tipoDocumento")
	    private String tipoDocumento_pac;
	    @JsonProperty("data.pacs.numeroDocumento")
	    private String numeroDocumento_pac;
	    @JsonProperty("data.pacs.primerNombre")
	    private String primerNombre_pac;
	    @JsonProperty("data.pacs.segundoNombre")
	    private String segundoNombre_pac;
	    @JsonProperty("data.pacs.apellido")
	    private String apellido_pac;
	    @JsonProperty("data.pacs.segundoApellido")
	    private String segundoApellido_pac;
	    @JsonProperty("data.pacs.edad")
	    private String edad_pac;
	    @JsonProperty("data.pacs.genero")
	    private String genero_pac;
	    @JsonProperty("data.pacs.fechaNacimiento")
	    private String fechaNacimiento_pac;
	    @JsonProperty("data.pacs.relacion.codigo")
	    private String cod_rel;
	    @JsonProperty("data.pacs.relacion.descripcion")
	    private String des_rel;
	    @JsonProperty("data.pacs.fechaInicioVigencia")
	    private String fechaInicioVigencia_pac;
	    @JsonProperty("data.pacs.fechaFinVigencia")
	    private String fechaFinVigencia_pac;
	    @JsonProperty("data.pacs.fechaRegistroRetiro")
	    private String fechaRegistroRetiro;
	    @JsonProperty("data.pacs.discapacidad")
	    private String discapacidad;
	    @JsonProperty("data.pacs.fechaLimiteComprobanteNutricional")
	    private String fechaLimiteComprobanteNutricional;
	    @JsonProperty("data.pacs.documentacion.motivoBloqueo")
	    private String motivoBloqueo;
	    @JsonProperty("data.pacs.documentacion.descripcionBloqueo")
	    private String des_blo;
	    @JsonProperty("data.pacs.documentacion")
	    private String descripcionBloqueo;
	    @JsonProperty("data.pacs.tarjeta.numero")
	    private String numero_tar_pac;
	    @JsonProperty("data.pacs.tarjeta.estado")
	    private String estado_tar_pac;
	    @JsonProperty("data.pacs.tarjeta.lote")
	    private String lote_tar_pac;	  
	    @JsonProperty("data.pacs.cuotaMonetaria.valorSubsidio")
	    private String valorSubsidio;	    
	    @JsonProperty("data.pacs.cuotaMonetaria.administrador.tipoDocumento")
	    private String tipoDocumento_adm;
	    @JsonProperty("data.pacs.cuotaMonetaria.administrador.numeroDocumento")
	    private String numeroDocumento_adm;
	    @JsonProperty("data.pacs.cuotaMonetaria.administrador.primerNombre")
	    private String primerNombre_adm;
	    @JsonProperty("data.pacs.cuotaMonetaria.administrador.segundoNombre")
	    private String segundoNombre_adm;
	    @JsonProperty("data.pacs.cuotaMonetaria.administrador.apellido")
	    private String apellido;
	    @JsonProperty("data.pacs.cuotaMonetaria.administrador.segundoApellido")
	    private String segundoApellido_adm;
	    @JsonProperty("data.pacs.cuotaMonetaria.motivoBloqueo")
	    private String motivoBloqueo_cuo;
	    @JsonProperty("data.pacs.cuotaMonetaria.salario")
	    private String salario_cuo;
	    @JsonProperty("data.pacs.nivelEducativo")
	    private String nivelEducativo_pac;
	    @JsonProperty("data.pacs.estado")
	    private String estado_pac;
	    @JsonProperty("data.pacs.validado.correo")
	    private String correo_val;
	    @JsonProperty("data.pacs.validado.celular")
	    private String cel_pac;
	    @JsonProperty("data.pacs.validado.afiliado")
	    private String afil_pac;
	    @JsonProperty("data.pacs.validado.segmento")
	    private String segmento;
	    @JsonProperty("data.pacs.validado.rango")
	    private String rango;
	    @JsonProperty("data.pacs.validado.genero")
	    private String genero_val;
	    @JsonProperty("data.pacs.validado.habeas")
	    private String habeas;
	    @JsonProperty("data.pacs.validado.fechaValidacion")
	    private String fechaValidacion;
	    @JsonProperty("data.pacs.validado.nombre.primero")
	    private String primero;
	    @JsonProperty("data.pacs.validado.nombre.segundo")
	    private String segundo;
	    @JsonProperty("data.pacs.validado.nombre.primerApellido")
	    private String primerApellido_val;
	    @JsonProperty("data.pacs.validado.nombre.segundoApellido")
	    private String segundoApellido_val;
	    @JsonProperty("data.pacs.validado.direccion.direccionPrincipal")
	    private String direccionPrincipal_val;
	    @JsonProperty("data.pacs.validado.afiliacion.categoria")
	    private String categoria_val;
	    @JsonProperty("data.pacs.validado.empresa.nombre")
	    private String nombre;
	    @JsonProperty("data.pacs.validado.empresa.documento.tipo")
	    private String tipo;
	    @JsonProperty("data.pacs.validado.empresa.documento.numero")
	    private String numero;
	    
	    @JsonProperty("data.validado.correo")
	    private String correo_vali;
	    @JsonProperty("data.validado.celular")
	    private String celular;
	    @JsonProperty("data.validado.afiliado")
	    private String afiliado;
	    @JsonProperty("data.validado.segmento")
	    private String segmento_val;
	    @JsonProperty("data.validado.rango")
	    private String rango_val;
	    @JsonProperty("data.validado.genero")
	    private String genero_vali;
	    @JsonProperty("data.validado.estadoCivil")
	    private String estadoCivil_val;
	    @JsonProperty("data.validado.habeas")
	    private String habeas_val;
	    @JsonProperty("data.validado.fechaValidacion")
	    private String fechaValidacion_val;
	    @JsonProperty("data.validado.nombre.primero")
	    private String primero_val;
	    @JsonProperty("data.validado.nombre.segundo")
	    private String segundo_val;
	    @JsonProperty("data.validado.nombre.primerApellido")
	    private String primerApellido_vali;
	    @JsonProperty("data.validado.nombre.segundoApellido")
	    private String segundoApellido_vali;
	    @JsonProperty("data.validado.direccion.direccionPrincipal")
	    private String direccionPrincipal_vali;
	    @JsonProperty("data.validado.afiliacion.categoria")
	    private String categoria_vali;
	    @JsonProperty("data.validado.empresa.nombre")
	    private String nombre_emp;
	    @JsonProperty("data.validado.empresa.documento.tipo")
	    private String tipo_doc_vali;
	    @JsonProperty("data.validado.empresa.documento.numero")
	    private String numero_doc_vali;
	  
	   
	    
	   
	   
	
	   
	    
	    
	    
}
