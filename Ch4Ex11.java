import java.util.*;

public class Ch4Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 15");
		
		int i = input.nextInt();
		
		if (i < 15 && i >= 0){
			String hex = Integer.toHexString(i);
			String upperHex = hex.toUpperCase();
			System.out.println("The hex value is " + upperHex);
		}
			else {
				System.out.println(i + " is an invalid input");
			}
		
	}

}
