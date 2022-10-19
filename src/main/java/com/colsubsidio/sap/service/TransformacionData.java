package com.colsubsidio.sap.service;

import java.util.Iterator;

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
		Iterator<String> keys = afil.keys();
		 while (keys.hasNext())
		 {
			 String key = keys.next();
			 System.out.println(afil.get(key) instanceof JsonArray);
			 System.out.println(afil.get(key) instanceof JsonObject);

			 if (afil.get(key) instanceof JsonArray )
			 {
//				 && !"type".equals(afil.get(key))
				 System.out.println(key);
				 System.out.println(afil.get(key));
			 }
			
		}
	}

	@Override
	public void transDEmp(JSONObject emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
