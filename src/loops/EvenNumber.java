package loops;

public class EvenNumber {

	public static void main(String[] args) {

		int i = 1;

		while (i < 50) {
			int remainder = i % 2;

			boolean iseven = remainder == 0;

			if (!iseven) 
			{
				System.out.println(i);
			}
			
			i++;

		}

	}

}
