package loops;

public class ReverseNumber {

	public static void main(String[] args) {
		int originalnumber = 12121;
		int number = originalnumber;
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10; // 5--> 4 --> 3
			reverse = reverse * 10 + remainder;

			number = number / 10;
			
		}

		System.out.println(reverse);
		
		if(reverse==originalnumber)
		{
			System.out.println(originalnumber+ " is a palindrome number");
		}
		else
		{
			System.out.println(originalnumber+ " is not a palindrome number");
		}

	}

}
