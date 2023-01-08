package stringdiscussion;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		String s = "kjsdfhkjsfkdjsdf";
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			
			char c = s.charAt(i);
			if(!(lhs.contains(c)))
			{
				lhs.add(c);
			}
		}
		
		System.out.println(lhs);
		
		
		
		
		
	}

}
