package stringdiscussion;

public class AddIndividualNumberFromString {
	
	
	public static void main(String[] args) {
		
		
		String s = "sjhd3jshdf23kfk3jdk333";
		
		String number = "";
		
		int sum = 0;
		for(int i=0; i<s.length(); i++)
		{
			
			
		char c = s.charAt(i);
		
		
		
		if(Character.isDigit(c))
		{
		number = number+c;
		int value = Integer.parseInt(number);
		
		sum = value +sum;
		
		number = "";
		
		}
		
		
		}
		
		System.out.println(sum);
	}

}
