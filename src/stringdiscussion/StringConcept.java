package stringdiscussion;

public class StringConcept {
	
	public static void main(String[] args) {
		
		
		String s1 = new String("abc");
		
		System.out.println(s1);
		
		
		String s2 = new String("def");
		
		
		String s3 = new String("def");
		
		
		String s4 = "xyz";
		
		String s5 = "abc";
		
		String s6 = "abc";
		
		 boolean ispointingsame= s5==s6;
		 
		 System.out.println(ispointingsame);
		 
		boolean ispointingsame2 =  s1==s5;
		
		System.out.println(ispointingsame2);
		
	}

}
