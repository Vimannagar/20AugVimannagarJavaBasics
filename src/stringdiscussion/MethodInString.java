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
		
		String s7 = "Philadelphia";
		
		int count = 0;
		
		for(int i=0; i<s7.length(); i++ )
		{
			char s8 = s7.charAt(i);
			
			if(s8=='a')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	System.out.println("****************************************");
	
//		3. equals(String s)
		
		String s9 = "Velocity";
		
		String s10 = "Velocity";
		
		boolean s11 = s9.equals(s10);
		
		System.out.println(s11);// true
		
		System.out.println("****************************************");
		
//		4. equalsIgnoreCase(String s): 
		
		String s12 = "Velocity";
		
		String s13 = "velocity";
		
	boolean	s14 = s12.equalsIgnoreCase(s13);
	
	System.out.println(s14);//true
		
	System.out.println("****************************************");
	
//	5. concat(String s):
	
	String s15 = "Viman";
	
	String s16 = "nagar";
	
	String s17 = s15.concat(s16);
	
	System.out.println(s17);//Vimannagar
	
	System.out.println("****************************************");
	
	
//	6. substring(int index):
	
	
	String s18 = "Punecity";
	
	String s19 = s18.substring(4);
	
	System.out.println(s19);//city
	
	System.out.println("****************************************");	

	//	7. substring(int begin, int end)
	
	
	String s20 = "Narmadapuram";
	
	String s21 = s20.substring(3, 6);
	
	System.out.println(s21);//Narmada
		
		
	System.out.println("****************************************");		
		
//	8. replace(char old, char new):
	
	String s22 = "abcdbf";
	
	String s23 = s22.replace('b', 'c');
	
	System.out.println(s23);//accdcf
	System.out.println("****************************************");			
	
	
//	9. replace(String old, String new):
	
	String s24 = "Punecity";
	
	String s25 = s24.replace("city", "mahanagar");
	
	
	System.out.println(s25);//punemahanagar
	
	System.out.println("*************************************");
//	WAP to remove all the spaces from String - "this is String"
	
	String s28 = "this is String";
	
	String s29 = s28.replace(" ", "");
	
	System.out.println(s29);
	
	System.out.println("*************************************");
	
//	10. trim(): 
	
	String s26 = "    This    is a     String      "; 
	
	String s27 = s26.trim();
	
	System.out.println(s27);//This    is a     String
	
	
//	WAP to replace the unnecessary space value by single space in between the String - This    is a     String Output: -->This is a String 
	System.out.println("*************************************");
	
//	11. contains(String s):
	
	
	String s30 = "abcdef";
	
	boolean s31 = s30.contains("fe");
	
	System.out.println(s31);//true
	
	
	
//	12. toLowerCase():
	
	
	String s32 = "VelOcitY";
	
	String s33 = s32.toLowerCase();
	
	System.out.println(s33);//velocity
	System.out.println("*************************************");
	
//	13. toUpperCase():
	
	String s34 = "velocity";
	
	String s35 = s34.toUpperCase();
	
	System.out.println(s35);//VELOCITY
	
	
	System.out.println("*************************************");
	
//	WAP to check whether the String is Palindrome or not irrespective of their case
	
	
//	14. indexOf(char c):
	
	String s36 = "abcdef";
	
	int s37 = s36.indexOf('a');
	
	System.out.println(s37);
	
//	15. split
	
	
	}

}
