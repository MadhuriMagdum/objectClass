package palindrome;

import java.util.Scanner;

public class Ifelsewhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :  ");
		int num = sc.nextInt();
		int result = 0, reminder, reverse=num;
		while (num != 0) {
			reminder = num % 10;
			result = result * 10 + reminder;
			num /= 10;
		}
		if (reverse == result) {
			System.out.println(reverse + " is a Palindrome number.");
		} else {
			System.out.println(reverse + " is not a Palindrome number.");
		}
	}
}
