package methods;

public class MultiInputMultiOutput {
	
	
	
	public static String m1(String s , int i)
	{
		String ss = s+i;
		
		return ss;
	}
	
	public void m2(String s)
	{
		String s2 = s+2;
		
		System.out.println(s2);
	}
	
	
	
	
	public static void main(String[] args) {
		
		String val =  m1("Rollnum", 1);
		
		MultiInputMultiOutput mio = new MultiInputMultiOutput();
		
		mio.m2(val);
		
	}

}
