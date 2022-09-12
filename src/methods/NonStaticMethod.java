package methods;

public class NonStaticMethod {
	
//	syntax:
		
//		access_modifier void method_name()
//		{
//		
//		}
	
		
		public  void addition()
		{
			int a =10;
			int b = 20;
			int c= a+b;
		
		System.out.println("Addtion of "+a+" and "+b+" is "+c);
		
		}
		
		public  void substraction()
		{
			int a =10;
			int b = 20;
			int c= a-b;
		
		System.out.println("difference of "+a+" and "+b+" is "+c);
		
		}

		public static void main(String[] args) {
		
//			object creation syntax: 
//			classname variable_name = new Classname();
			
			NonStaticMethod var = new NonStaticMethod();
			
			var.addition();
			
			var.substraction();
			
			
			NonStaticMethod variable  = new NonStaticMethod();
			
			variable.addition();
			
			
			
		}
		
		
}
