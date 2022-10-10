package polymorphism;

	public class Child extends Parent  {
		
		public void bike()
		{
			System.out.println("bike from child");
		}
		
		public static void friend()
		{
			System.out.println("friend from child");
		}
		
		
		public void marry()
		{
			System.out.println("child class specific marry method");
		}
		
		public int m1()
		{
			System.out.println("m1 method with int return type");
			return 90;
		}
		
		public static void main(String[] args) {
			Child c = new Child();
			
			c.car();
			
			c.home();
			
			c.marry();//child class marry method will execute
			
			Parent p = new Parent();
			
			p.marry();//parent class marry method will execute
			
//			Parent class parent_class_reference_variable
			
			
			
			
		}
		
		
		
		
	
	}
