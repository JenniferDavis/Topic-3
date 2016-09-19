import java.util.*;

public class Ch18Ex10 {
	
	public static int length = 0;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string and a character: ");
		String word = input.next();
		char letter = input.next().charAt(0);
		length = word.length();
		int result = count(word, letter);
		System.out.println("The letter " + letter + " is in the string \"" + word + "\" " + result + " times.");
	}
	
	//public static int length;
	public static int count = 0;
	
	public static int count(String str, char a){
		
		if ( (length - 1) < 0 ) {
			return count;
		}
		else if ( str.charAt( length - 1) == a ) {
			count++;
		}
		length--;
		return count(str, a);
	}
}


