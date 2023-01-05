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
		
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		al3.add("CA");
		al3.add("MA");
		al3.add("CT");
		
		ArrayList<String> al2 = new ArrayList<String>(al);
		
		al2.addAll(al3);
		
		System.out.println(al2);
		
		al2.add("Bangkok");
		
		al2.add("Muskat");
		
		System.out.println(al2);
		
		
//		To check the content is present inside the collection or not
		
		boolean ispresent = al2.contains("CA");
		
		System.out.println(ispresent);//true
		
		boolean allpresent = al2.containsAll(al);
		
		System.out.println(allpresent);//true
		
		
		
//		to check whether collection is empty
		
		boolean isemptycollection = al2.isEmpty();
		
		System.out.println(isemptycollection);//true
		
//		to remove all the content of a specific collection
		
		al2.removeAll(al);
		
		boolean isalcontentpresent = al2.containsAll(al);
		
		System.out.println(isalcontentpresent);
	
		
//	To remove all the contents from a collection
		
		al2.clear();
		
		boolean isemptyoutput = al2.isEmpty();
		
		System.out.println(isemptyoutput);//true
		
		System.out.println(al2.size());//0
		
		
		for(String ss :al)
		{
			System.out.println(ss);
		}
//	WAP to add the value of Hyderabad only if collection has Bengaluru in it using normal for loop.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
