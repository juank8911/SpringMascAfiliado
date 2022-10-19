package com.colsubsidio.sap.adapters;

import java.lang.reflect.Type;

import org.json.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class AfiliadoAdapter implements JsonSerializer<Boolean>
{

	@Override
	public JsonElement serialize(Boolean aBoolean, Type type, JsonSerializationContext jsonSerializationContext) {
		// TODO Auto-generated method stub
        if(aBoolean == null) {  
            return new JsonPrimitive("");  
        }  
        return new JsonPrimitive(aBoolean.booleanValue() == true ? 1 : 0); 

	}
	
	public JsonArray afiliadoAdapter(JSONObject afili)
	{
		
		System.out.println(afili);
		JsonArray jsarr = new JsonArray();
		jsarr.add(afili+"");
		return jsarr;
		
	}
	
	
}
