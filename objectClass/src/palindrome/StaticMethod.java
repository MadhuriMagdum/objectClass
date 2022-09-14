package palindrome;

public class StaticMethod {
	public static void main(String arg[]) {
		int result, num = 12521, reverse = num;

		result = palindromeOrNot(num);

		if (result == reverse)// checks reverse number=original number
			System.out.println(reverse + " is a palindrome number ");
		else
			System.out.println(reverse + " is not a palindrome number ");
	}

	static int palindromeOrNot(int num)// static method to compute reverse no and return to main method

	{
		int sum = 0, reminder;

		while (num != 0) // get reverse of number
		{
			reminder = num % 10;
			sum = (sum * 10) + reminder;
			num /= 10;
		}

		return sum;// return reverse number to calling method
	}
}
