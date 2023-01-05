package collectiondiscussion;

import java.util.LinkedList;

public class LinkedListDisc {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		
		ll.add("abc");
		
		ll.add("def");
		
		ll.add("xyz");
		
		ll.remove(0);
		
		ll.set(1, "wxy");
		
	
		
		System.out.println(ll);
		
	}

}
