import java.util.*;

public class Ch6Ex31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter credit card number as a long integer: ");
		long cardNumber = input.nextLong();
		
		if(isValid(cardNumber)){
			System.out.println(cardNumber + " is valid");
		}
		else{
			System.out.println(cardNumber + " is invalid");
		}        
	}

	
	
	
	
	
	
	
	// return true if the card number is valid
	public static boolean isValid(long number){
		// check 1: does it have 13-16 digits?
		long ccNumber = number;
		boolean validity = false;
		if( (getSize(ccNumber) >= 13) && (getSize(ccNumber) <= 16) ){
			validity = true;
		}
		else {
			validity = false;
		}
		
		// check 2: must start with a 4, 5, 37 or 6		
		int visa = 4;
		int mastercard = 5;
		int amEx = 37;
		int discover = 6;
		
		if (prefixMatched(ccNumber, visa) || prefixMatched(ccNumber, mastercard) || prefixMatched(ccNumber, amEx) || prefixMatched(ccNumber, discover)){
			validity = true;
		}
		else {
			validity = false;
		}
		
		// check 3: 	Validate number through Luhn check
		if( ( (sumOfDoubleEvenPlace(ccNumber) + sumOfOddPlace(ccNumber) ) %10 ) == 0){
			validity = true;
		}
		else {
			validity = false;
		}
		
		// final answer
		return validity;
	}

	
	// get the result from step 2
	public static int sumOfDoubleEvenPlace(long number){
		
		long ccNumber = number;
		//convert to a string for length
		String stringNumber = "" + ccNumber;
		
		// reverse number so you can go left to right
		long reversedNumber = reverse(ccNumber);
		long sum = 0;
		long remainder = 0;
		int i = 1 ;
		while(i < stringNumber.length() ){
			 remainder = reversedNumber % 100;
			 remainder = (remainder / 10) * 2;
			 reversedNumber = reversedNumber / 100;
			 // check if a single or double digit
			 remainder = getDigit((int)remainder);
			 sum = sum + remainder;
			 i = i++;
		}
		return (int)sum;
	}
	
	
	
	
	
	// return this number if it is a single digit, otherwise, return the sum of the two digits
	public static int getDigit(int number){
		int n = number;
		//convert to a string for length
		String stringNumber = "" + n;
		if (stringNumber.length() == 1){
			return n;
		}
		else {
			char no1 = stringNumber.charAt(0);
			char no2 = stringNumber.charAt(1);
			int answer = (int)no1 + (int)no2;
			return answer;
		}
	}
	
	
	
	
	
	
	// return sum of odd-place digits in number
	public static int sumOfOddPlace(long number){
		long ccNumber = number;
		//convert to a string for length
		String stringNumber = "" + ccNumber;
		
		// reverse number so you can go left to right
		long reversedNumber = reverse(ccNumber);
		long sum = 0;
		long remainder = 0;
		int i = 0 ; 
		while(i < stringNumber.length() ){
			 remainder = reversedNumber % 100;
			 remainder = remainder / 10;
			 reversedNumber = reversedNumber / 100;
			 sum = sum + remainder;
			 i++;
		}
		return (int)sum;
	}
	
	
	
	
	
	
// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static long reverse(long number){
		long num = number;
		long reversedNumber = 0;
		while (num != 0){
			long remainder = num%10;
			num = num / 10;
			reversedNumber = (reversedNumber + remainder) * 10;		
			}
		long reverseNumber = reversedNumber / 10;
		return reverseNumber;
		}   
	
	
	
	
	
	
	//return true if the digit d is a prefix for number
	public static boolean prefixMatched(long number, int d){
		long ccNumber = number;
		
		//convert to a string
		String stringNumber = "" + ccNumber;
		String company = "" + d;
		
		if(stringNumber.startsWith(company)){
			return true;
		}
		else {
			return false;
		}
	}

		
		
		
		
	// return the number of digits in d
	public static int getSize(long d){
		long cardNumber = d;
		//convert to a string for length
		String stringNumber = "" + cardNumber;
		int size = stringNumber.length();
		return size;
	}
	
	
	
	
	
/*	
	//return the first k number of digits from number.  If the number of digits in number is less than k, return number
	public static long getPrefix(long number, int k){
	
		}
	}
	
	*/
	
	
}
