package Array;

public class PallindromeNumber {

	public static boolean checkPalindrome(int num) {
		int number = num;
		int ans = 0;
		while(number > 0) {
			int rem = number%10;
			ans = ans*10+rem;
			number/=10;
		}
		return ans == num;
	}
	public static void main(String[] args) {
		int digit = 131;
		int num = digit;
		boolean ans = checkPalindrome(num);
		
		if(ans) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}

	}

}
