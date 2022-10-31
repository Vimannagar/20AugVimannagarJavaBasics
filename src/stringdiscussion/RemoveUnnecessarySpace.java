package stringdiscussion;

public class RemoveUnnecessarySpace {
	
	public static void main(String[] args) {
		
		String s = "This     is   String";
		
		String withoutspace = "";
		
		for(int i=0; i<s.length(); i++ )
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)==' '))
			{
				continue;
			}
			else
			{
				withoutspace= withoutspace + s.charAt(i);
			}
		}
		
		System.out.println(withoutspace);
		
	}

}
