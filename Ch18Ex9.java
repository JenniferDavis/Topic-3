import java.util.*;

public class Ch18Ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.next();
		reverseDisplay(s);
		
	} // end main

	
	public static void reverseDisplay(String value){
		 String result="";
		 for (int i=value.length()-1; i>=0; i--) {
			 result = result + value.charAt(i);
		 }
		    System.out.println(result);
	
	}
}
