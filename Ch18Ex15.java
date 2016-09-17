import java.util.Scanner;

public class Ch18Ex15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string and a character: ");
		String word = input.next();
		String letterInput = input.next();
		char letter = letterInput.charAt(0);
		
		int number = count(word, (char)letter);
		System.out.println("The letter " + letter + " occurs " + number + " times in the word " + word + ".");
	}

	public static int count(String str, char a){
		String s = str;
		char ch = a;
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == a ) {
		        counter++;
		    }     
		}
		return counter;
	 }
	
	
	public static int count(String str, char a, int high){
		
	}
	
	
}
