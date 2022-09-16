package variable;

public class DefaultValues {
	
	int i;
	int j;
	
	static char c;
	String s;
	boolean d;
	
static	double e;
	
	public static void main(String[] args) {
		DefaultValues dv = new DefaultValues();
		
		
		System.out.println(dv.i);//0
		
		System.out.println(c);//<space>
		
		System.out.println(dv.d);//false
		
		System.out.println(dv.s);//null
		
		
		System.out.println(e);
	}

}
