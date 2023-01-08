package stringdiscussion;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountNumberOfCharactersInString {
	
	public static void main(String[] args) {
		
		
		String s = "jhdjsdjdrrfgf";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++ )
		{
			char charvalue = s.charAt(i);
			
			if(hm.containsKey(charvalue))
			{
				hm.put(charvalue, hm.get(charvalue)+1);
			}
			else
			{
				hm.put(charvalue, 1);
			}
		}
		
// 		System.out.println(hm);
		
		Set<Entry<Character, Integer>> keyvalue = hm.entrySet();
		
		
		for(Entry<Character, Integer> kv :keyvalue )
		{
			Character key = kv.getKey();
			
			Integer value = kv.getValue();
			
			System.out.print(key+""+value);
		}
		
		
		
	}

}
