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
	public void transData(JSONObject afil)
	{
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
			 if ("data".equals(key))
			 {
//				 System.out.println(afil.get(key));
				 JSONObject datas = new JSONObject(afil.get(key));
				 Iterator<String> kysDate = datas.keys();
				 
				 while (kysDate.hasNext()) 
				 {
					 
					 String kyDate = kysDate.next();
					 System.out.println("segundo wile");
					 System.out.println(datas.get(kyDate));
					
				}
			 }
			
		}
	}

	@Override
	public void transDEmp(JSONObject emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
