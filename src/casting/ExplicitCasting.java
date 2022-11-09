package casting;

public class ExplicitCasting {
	
	public static void main(String[] args) {
		
		int i = 60;
		
		short s = (short)i;
		
		System.out.println(s);//60
		
		float f = 89.63f;
		
		int	d = (int)f;
		
		System.out.println(d);//89
		
		int j = 131;
		
		byte b = (byte)j;
	
		System.out.println(b);//-125
		
		
		char k = 'a';
		
		int z = (int)k;//---> implicit
		System.out.println(z);//97
		
		char o	= (char)z;//---> Explicit
		System.out.println(o);//'a'
			
		
		
		
		
	}

}
