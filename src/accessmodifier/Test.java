package accessmodifier;

 public class Test {
	
	 public int i = 20;
	 
	 char c = 'r';
	 
	 private String s;
	
	public void m1()
	{
		System.out.println("public non static method from Test class");
	}
	
	void m2()
	{
		System.out.println("default method from Test class");
	}
	
	
		private void m3()
		{
			System.out.println("private method from Test class");
		}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.m1();// public method from Test class
		
		t.m2();// default method from Test class
		
		t.m3();// private method from Test class
		
		
	}

}
