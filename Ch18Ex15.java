import java.util.*;

public class Ch18Ex15 {
	
	public static int length = 0;
	public static String word;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string and a character: ");
		word = input.next();
		char letter = input.next().charAt(0);
		int result = count(word, letter, high());
		System.out.println("The letter " + letter + " is in the string \"" + word + "\" " + result + " times.");
	}
	
	public static int count = 0;
	
	public static int high() {
		int highestIndex = word.length() - 1;
		return highestIndex;
	}
	
	public static int count(String str, char a, int high){
		
		if ( (high) < 0 ) {
			return count;
		}
		else if ( str.charAt( high ) == a ) {
			count++;
		}
		high--;
		return count(str, a, high);
	}
}


