package categoriesofmethod;

public class NoRetWithArg {
	
	
	public void addition(int a, String s, int b)
	{
		int c = a+b;
		
		System.out.println(c);
		
		System.out.println(s);
			
	}
	
	
	
	public static void multiplication(int d, int e)
	{
		int f= d*e;
		
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		
		NoRetWithArg nrwa = new NoRetWithArg();
		
		
		nrwa.addition(5, "Velocity", 2);
		
		
		multiplication(2, 3);//6
		
		multiplication(6, 5);//30
		
//WAP for calculator in which we can perform the addition, multiplication, substraction and division for any 2 two		
		
		
		
	}

}
