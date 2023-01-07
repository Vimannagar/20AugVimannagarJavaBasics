package collectiondiscussion;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDisc {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Pune");
		ts.add("Mumbai");
		ts.add("Trichy");
		ts.add("Bengaluru");
		ts.add("Pune");
		ts.add("Chennai");
		ts.add("Trichy");
		
		
		System.out.println(ts);
		
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>(new MyComp());
		
		ts1.add(500);
		ts1.add(60);
		ts1.add(80);
		ts1.add(100);
		ts1.add(2);
		ts1.add(96);
		
		System.out.println(ts1);
		
		
		
	}

}
