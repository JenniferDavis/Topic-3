import java.util.*;

public class Ch6Ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		int reversedNumber = 0;
		
	// test reverse number
		int reversedInteger = reverse(number);
		System.out.println(reversedInteger);
	
		
		boolean testPalendrome = isPalindrome(number);
		if (testPalendrome == true){
			System.out.println(number + " is a palendrome");
		}
		else {
			System.out.println(number + " is not a palendrome");
		}
		
		
	} // close main
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number){
		int num = number;
		int reversedNumber = 0;
		while (num != 0){
			int remainder = num%10;
			num = num / 10;
			reversedNumber = (reversedNumber + remainder) * 10;		
			}
		int reverseNumber = reversedNumber / 10;
		return reverseNumber;
		}    
	


	// Return true if number is a palindrome
	public static boolean isPalindrome(int number) {
		int a = number;
		int aReversed = reverse(a);
		if (a == aReversed)
			return true;
		else 
			return false;
		
	}
	

} // close Ch6Ex3
