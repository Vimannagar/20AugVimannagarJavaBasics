package collectiondiscussion;

import java.util.HashSet;
import java.util.LinkedHashSet;

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
			
			
			LinkedHashSet<String> lhs = new LinkedHashSet<String>();
			lhs.add("Pune");
			lhs.add("Mumbai");
			lhs.add("Trichy");
			lhs.add("Bengaluru");
			lhs.add("Pune");
			lhs.add("Chennai");
			
			lhs.add("Trichy");
			
			
			System.out.println(lhs);
			
			
		}
		
		
		
		
		
		

}
