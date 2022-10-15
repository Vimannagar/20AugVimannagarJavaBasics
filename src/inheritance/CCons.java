package inheritance;

public class CCons extends PCons{
	
	public CCons(int i)
	{
		System.out.println("zero argument constructor from Child class");
	}
	
	public static void main(String[] args) {
//		CCons c = new CCons();--> Parent class constuctor doesnt get call directly by creating child class zero argument constructor.
		
		
	}

}
