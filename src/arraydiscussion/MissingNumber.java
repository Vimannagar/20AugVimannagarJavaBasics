package arraydiscussion;

import java.util.Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int [] a = {1, 5, 3, 2, 6};
					
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++)
		{
			if(!(a[i]+1 ==a[i+1]))
			{
				System.out.println(a[i]+1);
				break;
			}
		}
		
		
	}

}
