package casting;

public class Child extends Parent{
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		
		Parent pp = (Parent)c;// Up casting
		
		Child ccc = (Child)pp;// Down casting
		
		
//		Parent p = new Parent();
//		
//		Child cc = (Child)p; // CastCastException because child reference variable cannot have a parent object
		
		
		
		
		
		
		
		
	}

}
