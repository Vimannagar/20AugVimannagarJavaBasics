package stringdiscussion;

public class Test {

	public static void main(String[] args) {

		
		
		
		String s = "abc";
		
		

		String s1 = s.concat("def");

		System.out.println(s);// abc--> immutable

		StringBuffer sb = new StringBuffer("def");

		sb.append("ghi");

		System.out.println(sb);// defghi --> mutable
		
		
		

	}

}
