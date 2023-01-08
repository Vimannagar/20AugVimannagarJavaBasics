package stringdiscussion;

public class PatternMatching {
	
	public static void main(String[] args) {
		String a = "abcdef";
		
		String pat = "abc";
		
		
		String s = "ksjdhkkdhkfdfhdskdhkjsd";
		
		String pattern = "dhk";
		
		int count =0;
		
		String [] sarray = new String[s.length()-2];
		
	int end = 3;
	int start = 0;
	
	for(start= 0; end<=s.length(); end++)
	{
		String ss = s.substring(start, end);
		
		sarray[start]= ss;
		
		start++;
	}
	
	for(int i=0; i<sarray.length; i++ )
	{
		if(sarray[i].equals(pattern))
		{
			count++;
		}
	}
	
	System.out.println("Pattern appears inside the String for "+ count+" times");
		
		
		
	}

}
