package com.colsubsidio.sap.service;

import java.util.Iterator;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.colsubsidio.sap.interfaz.ITransDatos;


@Service
public class TransformacionData implements ITransDatos {

	@Override
	public void transData(JSONObject afil)
	{
		Iterator<String> keys = afil.keys();
		 while (keys.hasNext())
		 {
			 String key = keys.next();
			 System.out.println(key);
			 System.out.println(afil.get(key));
			 if (afil.get(key) instanceof JSONObject && !"type".equals(afil.get(key)))
			 {
				 
			 }
			
		}
	}

	@Override
	public void transDEmp(JSONObject emp) {
		// TODO Auto-generated method stub
		
	}
	
	

}
