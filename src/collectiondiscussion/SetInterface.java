package collectiondiscussion;

import java.util.HashSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Pune");
		hs.add("Mumbai");
		hs.add("Trichy");
		hs.add("Bengaluru");
		hs.add("Pune");
		hs.add("Chennai");
		
		hs.add("Trichy");
		
		
		System.out.println(hs);
		
	}

}
