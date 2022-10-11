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
			System.out.println("m1 method with int return type of child class");
			return 90;
		}
		
		public static void main(String[] args) {
			Child c = new Child();
			
			c.car();
			
			c.home();
			
			c.marry();//child class marry method will execute
			
			Parent p = new Parent();
			
			p.marry();//parent class marry method will execute
			
//			parentclass refvariable = new childclass();--> syntax
			
			Parent p1 = new Child();
			
			p1.m1();// child class m1 method
			
			p1.capital();// parent class capital method
			
			p1.marry();// child class marry method
			
//			Child c1 = new Parent();--> this case is invalid 
			
			p1.car();
			
			
			
			
		}
		
		
		
		
	
	}
