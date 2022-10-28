package stringdiscussion;

public class MethodInString {
	
	public static void main(String[] args) {
		
		
		String s1 = "abcdef";
		
//		1.length()
		
		int size = s1.length();
		
		System.out.println(size);//6
		
		
//		2. charAt(int index)
		
		String s2 = "velocity";
		
		char c = s2.charAt(2);
		
		System.out.println(c);//l
		
		
//		maximum index position = length-1
		
		
//		WAP to print all the characters of a String one by one- Velocity
		
		String s3 = "Velocity";
		
		int lastindexposition = s3.length()-1;
		
		for(int i=0; i<=lastindexposition; i++)
		{
			char charvalue =s3.charAt(i);
			
			System.out.println(charvalue);
		}
		
//		WAP to print the reverse of a String - abcdef--> fedcba
		
		
		String s4 = "abcdef";
		
		String reverse = "";
		int s5 = s4.length()-1;
		
		for(int j=s5; j>=0; j--)
		{
			char s6 = s4.charAt(j);
			
			reverse = reverse + s6;
		}
		
		System.out.println("Reverse of string is :"+reverse);
		
//WAP to count occurance of 'a' character inside a string - Philadelphia	
		
		
		
	}

}
