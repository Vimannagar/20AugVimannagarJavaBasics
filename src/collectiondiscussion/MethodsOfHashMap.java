package collectiondiscussion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsOfHashMap {
	
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(500, "Pune");

		hm.put(800, "Delhi");

		hm.put(5, "Mumbai");
		
		hm.put(900, "Nagpur");
		
		hm.put(50, "Bengaluru");
		
		hm.put(78, "Chennai");
		
		System.out.println(hm);
		
//		To get all the keys 
		
		Set<Integer> keys = hm.keySet();
		
		System.out.println(keys);
		
		for(int d :keys)
		{	
			System.out.println(d);
		}
		
		
//		To get all the values
		
		
	Collection<String> allvalue = hm.values();
	
	System.out.println(allvalue);
	
	for(String s:allvalue)
	{
		System.out.println(s);
	}
	
	
//	to check a key is present inside the map
	
	
	boolean iskeypresent = hm.containsKey(600);
	
	System.out.println(iskeypresent);//false
	
	
//	to check a value is present 
	
	
	boolean isvaluepresent = hm.containsValue("Delhi");
	
	System.out.println(isvaluepresent);//true
	
//	To get the value on the basis of key
	
	String valueofkey = hm.get(78);
	
	System.out.println(valueofkey);
	
	
	
//	to iterate hashmap
	Set<Entry<Integer, String>> keyvalues = hm.entrySet();
	
	
	for(Entry<Integer, String> kv :keyvalues)
	{
		Integer keyvalue = kv.getKey();
		String value = kv.getValue();
		if(keyvalue >100)
		{
		System.out.println(keyvalue + " "+ value);
		}
		
	}
	
	
		
	}

}
