package inheritance;

public class Child extends Parent{
	
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
		
	}

}
