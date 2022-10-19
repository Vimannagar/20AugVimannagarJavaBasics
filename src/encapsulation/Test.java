package encapsulation;

public class Test {
	
	int i =50;
	
	
	public int getValue()
	{
		i= i+2;
		return i;
	}
	
	public static void main(String[] args) {
		
		
		Test t = new Test();
		
		t.getValue();
	}

}
