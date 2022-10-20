package com.colsubsidio.sap.service;

import java.io.Console;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.colsubsidio.sap.interfaz.ITransDatos;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;




@ConfigurationProperties(prefix = "appli")
@Service
public class TransformacionData implements ITransDatos {

	
@Value("${my.property.s:}")
private String innerS;

@Value("${estado.afiliado.estado:}")
private JSONObject estado;





	@Override
	public JSONObject transData(JSONObject afil)
	{
		JSONObject resp = new JSONObject();
		JSONArray data = afil.getJSONArray("data");
//		System.out.println(data);
		Iterator<String> keys = afil.keys();
		 while (keys.hasNext())
		 {
			 String key = keys.next();
//			 System.out.println(afil.get(key) instanceof JsonArray );
//			 System.out.println(afil.get(key) instanceof JsonObject);
//			 System.out.println("data".equals(key)+" data=?");
//			 System.out.println(key);
			 if (afil.get(key) instanceof JSONArray)
			 {
//				 System.out.println("es array");
				 JSONArray auxdt = afil.getJSONArray(key);
//				 System.out.println(auxdt.length());
				 for(int i=0;i<auxdt.length();i++)
				 {
					 JSONObject aux = auxdt.getJSONObject(i);
					 System.out.println(aux instanceof JSONObject);
					 
					 if(aux instanceof JSONObject)
					 {
						 Iterator<String> keys2 = aux.keys();
						 			while (keys2.hasNext())
						 			{
						 				String key2 = keys2.next();
//						 				System.out.println(key2);
						 				System.out.println(aux.get(key2).getClass());
						 				//tratar datos de pacs
						 				//tratar datos de afiliado
						 				//tratar Datos de empleadores
						 				if("pacs".equals(key2) && aux.get(key2) instanceof JSONArray)
						 				{
						 				JSONArray pacsRt = aux.getJSONArray(key2);
						 				pacsRt = TransDatosPacs(pacsRt);
						 				resp.put(key2,pacsRt);
						 				}
						 			
						 			}
						 
					 }
					 else
					 {
						 System.out.println("no esw objeto");
					 }
					 
				 }
			 }
			 else 
			 {
//				 System.out.println("no es array");
				 resp.put(key, afil.get(key));
				 
				 
			 }
//			 System.out.println(resp.toString());
	
			
		}
		return resp;
	}

	private JSONArray TransDatosPacs(JSONArray pacs) {
		// TODO Auto-generated method stub
		JSONArray respPacs = new JSONArray();
			for(int i=0;i<pacs.length();i++)
			{
//				JsonObject  = new JsonObject();
				JSONObject JsoBenf = new JSONObject();
//				JsoBenf.addProperty("token", currentTokenNo.replaceAll("\"","").replaceAll("/","")); 
				JSONObject auxPac = pacs.getJSONObject(i);
				JsoBenf.put("documento", "1234");
				System.out.println(auxPac.toString());		
//				JsoBenf.addProperty("numeroDocumento", (String) auxPac.get("numeroDocumento"));
//				JsoBenf.addProperty("prueba", auxPac.get("numeroDocumento").toString());
//				JsoBenf.addProperty("bNombre", auxPac.get("primerNombre") +" "+auxPac.get("segundoNombre")+" "+auxPac.get("apellido")+" "+auxPac.get("segundoApellido"));
//				JSONObject relacion = auxPac.getJSONObject("relacion");
//				JsoBenf.addProperty("relacion", (String) relacion.get("descripcion"));
//				JsoBenf.addProperty("genero", auxPac.get("genero").toString().equals("1")?"Femenino":"Masculino");
//				System.out.println(auxPac.get("fechaNacimiento"));
//				convertirFecha(auxPac.get("fechaNacimiento").toString());
//				String estd = convertirEstado(auxPac.get("estado").toString(), estado);
//				JsoBenf.addProperty("estado", estd);
//				JsoBenf.addProperty("discapacidad", auxPac.getString("discapacidad").equals("null")?"":auxPac.getString("discapacidad"));
				
				
				System.out.println(JsoBenf);
				respPacs.put(JsoBenf);
			}
			System.out.println(respPacs);	
		return respPacs;
	}
	
	
	//este metodo necesito que lo realices 
	public void convertirFecha(String fecha) throws  ParseException
	{
		SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY"); 
		Date fecha1 = formato.parse(fecha);
		System.out.println("dentro de convertir fecha");
		System.out.println(fecha1);
	}
	
	public String convertirEstado(String estadoAp, JSONObject estYml)
	{
		String estad = estYml.get(estadoAp).toString();
		return estad;
	}

	@Override
	public void transDEmp(JSONObject emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
