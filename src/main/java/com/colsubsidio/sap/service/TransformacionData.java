package com.colsubsidio.sap.service;

import java.io.Console;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.colsubsidio.sap.interfaz.ITransDatos;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


@Service
public class TransformacionData implements ITransDatos {

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
				 resp.append(key, afil.get(key));
			 }
//			 System.out.println(resp.toString());
	
			
		}
		return resp;
	}

	private JSONArray TransDatosPacs(JSONArray pacs) {
		// TODO Auto-generated method stub
			
			for(int i=0;i<pacs.length();i++)
			{
				System.out.println(pacs.length());
				JSONObject auxPac = pacs.getJSONObject(i);
				System.out.println(auxPac.get("nivelEducativo"));
			}
		return pacs;
	}

	@Override
	public void transDEmp(JSONObject emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
