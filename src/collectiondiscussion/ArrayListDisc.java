package collectiondiscussion;

import java.util.ArrayList;

public class ArrayListDisc {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		
//		Adding the elements into the arraylist
		
		al.add("abc");
		
		al.add("def");
		
		al.add("ghi");
		
		al.add("xyz");
		
		
		System.out.println(al);//[abc, def, ghi, xyz]
		
//		to remove the element from the collection
		
		al.remove(0);
		
		System.out.println(al);//[def, ghi, xyz]
		
		al.remove("ghi");
		
		
		System.out.println(al);//[def, xyz]
	
//		to update the collection
		
		al.set(0, "abc");
		
		System.out.println(al);//[abc, xyz]
		
		
//		to get the size of collection:
		
		int numberofelements = al.size();
		
		System.out.println(numberofelements);//2
		
		al.add("Mumbai");
		
		al.add("Delhi");
		
		al.add("Pune");
		
		al.add("Chennai");
		
		al.add("Kolkata");
		
		al.add("Bengaluru");
		
		
		System.out.println(al);
		
		int indexofchennai = al.indexOf("Chennai");
		
		System.out.println(indexofchennai);//5
		
		
		String value = al.get(2);
		
		System.out.println(value);//Mumbai
		
		
		System.out.println(al);
		
		
		ArrayList<String> al2 = new ArrayList<String>(al);
		
		System.out.println(al2);
		
		
		
		
	}

}
