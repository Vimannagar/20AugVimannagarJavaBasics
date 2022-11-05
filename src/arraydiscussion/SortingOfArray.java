package arraydiscussion;

public class SortingOfArray {
	
	public static void main(String[] args) {
		
		int [] a = {1, 5, 3, 2, 6};
		int var;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
			
				if(a[i]<a[j])
				{
					var = a[j];
					
					a[j] = a[i];
					
					a[i] = var;
					
					
				}
			
		
			
			}
		}
		
		for(int aa:a)
		{
			System.out.print(aa+" ");
		}
		
	}

}
