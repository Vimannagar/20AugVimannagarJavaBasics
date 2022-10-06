package inheritance;

public class CCons extends PCons{
	
	public CCons()
	{
		super(50);
		System.out.println("zero argument constructor from Child class");
	}
	
	public static void main(String[] args) {
		CCons c = new CCons();
		
	}

}
