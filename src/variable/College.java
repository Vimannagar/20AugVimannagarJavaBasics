package variable;

public class College {
	
	String studentname;
	
	static String college = "coep";
	
	int mathmarks;
	
	String city;

	
	public static void main(String[] args) {
		
		College s1 = new College();
		
		s1.studentname = "Daniel";
		
		s1.mathmarks = 50;
		
		s1.city = "Pune";
		
		System.out.println(s1.city);
		
	
		College s2 = new College();
		
		s2.studentname = "Eder";
		
		s2.mathmarks = 60;
		
		s2.city = "Nagpur";
		
		System.out.println(s2.studentname);
		
		
	}
}
