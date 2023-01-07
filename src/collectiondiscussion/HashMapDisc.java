package collectiondiscussion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapDisc {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(500, "Pune");

		hm.put(800, "Delhi");

		hm.put(5, "Mumbai");
		
		hm.put(900, "Nagpur");
		
		hm.put(50, "Bengaluru");
		
		hm.put(78, "Chennai");
		
		System.out.println(hm);
		
		
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(500, "Pune");

		lhm.put(800, "Delhi");

		lhm.put(5, "Mumbai");
		
		lhm.put(900, "Nagpur");
		
		lhm.put(50, "Bengaluru");
		
		lhm.put(78, "Chennai");
		
		System.out.println(lhm);
		
	}

}
