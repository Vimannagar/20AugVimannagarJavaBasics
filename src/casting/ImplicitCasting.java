package casting;

public class ImplicitCasting {
	
	
	public static void main(String[] args) {
		
		byte b = 10;
		
		int c = (int)b;
		
		System.out.println(c);//10--> implicit casting
		
		
		
		int d = 56;
		
		long l = (long)d;
	
		System.out.println(l);//56
		
		
		int y = 80;
		
		float f = (float)y;
		
		System.out.println(f);//80.0
		
		
		
	}

}
