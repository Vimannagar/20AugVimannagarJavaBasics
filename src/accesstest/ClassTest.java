package accesstest;

import accessmodifier.Test;
import accessmodifier.Test3;


public class ClassTest {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
//		Test2 t2 = new Test2(); Test2 class is default hence we will not be able to access it outside the package
		
		Test3 t3= new Test3();
		
		t.m1();//public method from Test class
		
//		t.m2(); // default method from Test class
		
	}
	
	

}
