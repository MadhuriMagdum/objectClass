package palindrome;

public class RecursionMethod {
	static int revRecursion(int num, int reverse)// recursive method will execute until no becomes 0
	{
	    if (num == 0) // if no becomes 0 return reverse
	        return reverse;
	    reverse = (reverse * 10) + (num % 10); // reverse of num stored in reverse
	    return revRecursion(num / 10, reverse); // no will be divided by 10 will again call recursive method
	}
	public static void main(String[] args) {
		int num = 9658569;// store the returned value from recursion method in reverse
		int reverse = revRecursion(num, 0);
		if (reverse == num) // check if reversed number = original number
			System.out.println(num + " is a Palindrome number.");
		else
			System.out.println(num + " is a Palindrome number");
	}
}
