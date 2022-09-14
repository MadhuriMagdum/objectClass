package palindrome;

public class WhlieLoop {

		public static void main(String[] args) {

//			int no = 12421;
//			int result = 0; 
//			int reminder;
//          int reverse=no;
           int no=1234321, result=0,reminder,reverse=no;
			while (no != 0) {
				reminder = no % 10;
				result = result * 10 + reminder;
				no /= 10;
			}
			if (reverse == result) // check if and reverse i.e. no are equal
			{
				System.out.println(reverse + " is a Palindrome number.");
			} else {
				System.out.println(reverse + " is not a Palindrome number.");
			}
		}
	}
