import java.util.*;

public class Ch18Ex25 {

	public static String word;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to display all of its permutations: ");
		word = input.next();
		displayPermutation(word);
	}

	public static void displayPermutation(String s) { 
	    displayPermutation("", s); 
	}

	private static void displayPermutation(String s1, String s2) {
	    int n = s2.length();
	    if (n == 0) System.out.println(s1);
	    else {
	        for (int i = 0; i < n; i++)
	        	displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, n));
	    }
	}
}
