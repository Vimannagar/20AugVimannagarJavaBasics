package arraydiscussion;

import java.util.Arrays;

public class DefinitionOfArray {
	
	public static void main(String[] args) {
		
//		Syntax: datatype [] variablename = new datatype[size];
		
		
		int [] a = new int[6];
		
		a[0] = 50;
		a[1] = 10;
		a[3] = 12;
		a[2] = 51;
		a[4] = 9;
		a[5] = 90;
		
		
		
		for(int i=0; i<6; i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		String [] s = new String[5];
		
		s[0] = "Mumbai";
		
		s[1] = "Delhi";
		
		s[2] = "Kolkata";
		
		s[3] = "Chennai";
		
		s[4] = "Pune";
		
		int d = s.length;
		
		System.out.println(d);
		
		for(int i=0; i<d; i++)
		{
			System.out.println(s[i]);
		}
		
		
//		WAP to print only even index position elements
		
//		WAP to print only odd index position elements
		
//		WAP to print the sum of the elements which are at even position
		
//		WAP to print the sum of elements which are even 
		
		
		
		System.out.println("*************************************");
		
		int b[] = {80, 56, 2, 4, 68, 96};
		
		for(int i=0; i<b.length; i++)
		{
			if(i%2==0)
			{
				System.out.println(b[i]);
			}
			
		}
		
		System.out.println("****************************************");
		
		int c [] = new int[5];
		
		c[0] = 56;
		
		c[1] = 10;
		
		c[2] = 62; 
		
		c[3] = 12;
		
		c[4] = 9;
		
		
		Arrays.sort(c);
		
		
		for(int f:c)
		{
			System.out.println(f);
		}
		
		
		
//		WAP to sort an array in ascending and descending order
		
//	WAP to find out the missing number from an array - {1, 5, 3, 2, 6}
		
		
		
		
	}

}
