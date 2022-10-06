package inheritance;

public class Child extends Parent{
	
	int i = 20;
	
	int j = 80;
	
	public void bike()
	{
		System.out.println("bike from child");
	}
	
	public static void friend()
	{
		System.out.println("friend from child");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.bike();// child class method
		
		c.home();// parent class method
		
		c.car();// parent class method
		
		c.capital();// parent class method
		
		friend();// child class method
		
		furniture();// parent class method
		
		c.farm();
		
		System.out.println(c.i);//20- non static variable from child class
		
		Parent p = new Parent();
		
		System.out.println(p.i);//10- non static variable from parent class
		
		System.out.println(s);//abc
		
		
		System.out.println(c.j);// j variable from Child class
		
		System.out.println(c.k); // k variable from Parent class
		
		
	}

}
