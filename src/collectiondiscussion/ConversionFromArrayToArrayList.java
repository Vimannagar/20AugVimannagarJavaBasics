package collectiondiscussion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ConversionFromArrayToArrayList {
	
	
	public static void main(String[] args) {
		
//		conversion of Array to ArrayList
		
		Integer i [] = {45, 2,6, 8, 10, 10};
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(i));
		
		
		System.out.println(al);//[45, 2, 6, 8, 10]
		
		
//		conversion of ArrayList to Array
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(50);
		
		al2.add(60);
		
		al2.add(70);
		
		al2.add(80);
		
		Integer[] i2 = new Integer[al2.size()];
		
		al2.toArray(i2);
		
		
		for(int f :i2)
		{
			System.out.println(f);
		}
		
		
	}

}
