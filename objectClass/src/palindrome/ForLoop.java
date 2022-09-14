package palindrome;

public class ForLoop {
	public static void main(String[] args) {
		int no = 123321, result = 0, reminder, reverse = no;
		for (; no != 0; no /= 10) // on each iteration no will be divided by 10
		{

			reminder = no % 10;// store the remainder no/10 in reminder

			result = result * 10 + reminder; // reversed number will be stored in result
		}
		if (reverse == result)// check if original no is equal to reverse no
			System.out.println(reverse + " is a palindrome number.");
		else
			System.out.println(reverse + " is not a palindrome number.");
	}
}
