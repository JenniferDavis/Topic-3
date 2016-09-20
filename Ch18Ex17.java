import java.util.*;

public class Ch18Ex17 {
	
	public static int length = 0;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of characters in one line and a character: ");
		// get the one line of input
		String listString = input.next();
		// get the char to count in line
		char letter = input.next().charAt(0);
		// create and fill an array with input
		char[] list = listString.toCharArray();
		
		// get length of line
		length = listString.length();
		
		// display results to console
		int result = count(list, letter);
		System.out.println("The character " + letter + " is in the list \"" + listString + "\" " + result + " times.");

	}
		
	
	public static int count = 0;
	public static int high = length -1;
	
	public static int count(char[] chars, char ch){
		if ( (length - 1) < 0 ) {
			return count;
		}
		else if ( chars[ length - 1] == ch ) {
			count++;
		}
		length--;
		return count(chars, ch);
	}

	
	public static int count(char[] chars, char ch, int high){
		if ( (high) < 0 ) {
			return count;
		}
		else if ( chars[ high ] == ch ) {
			count++;
		}
		length--;
		return count(chars, ch);
	}

}

