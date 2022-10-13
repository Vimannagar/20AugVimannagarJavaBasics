package accessmodifier;

public class ClassAccessTest {
	
	public static void main(String[] args) {
		
		Test t = new Test();// public class
		
		Test2 t2 = new Test2();// default class
		
		Test3 t3 = new Test3();
		
		t.m1();// public method from Test class
		
		t.m2();// default method from Test class
		
//		t.m3(); // private method cannot be called outside the class
		
		
	}

}
