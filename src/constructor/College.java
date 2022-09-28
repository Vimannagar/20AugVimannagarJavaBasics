package constructor;

public class College {
	
	String studentname;
	
	static String college = "coep";
	
	int mathmarks;
	
	String city;

	
	public College(String sname, int mmarks, String scity)
	{
		studentname= sname;
		
		mathmarks = mmarks;
		city= scity;
	}
	
	public static void main(String[] args) {
		
		College s1 = new College("Daniel", 50, "Pune");
		
		College s2 = new College("Eder", 40, "Mumbai");
		
		System.out.println(s2.city);
		System.out.println(s1.studentname);
		
	}

}
