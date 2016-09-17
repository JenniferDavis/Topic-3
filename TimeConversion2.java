import java.util.*;

public class TimeConversion2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time in decimal format: ");
		double timeInput = input.nextDouble();
	
		int hours = (int)timeInput;

		double dec = timeInput - hours;
		
		System.out.println(dec);
		
		//convert decimal to mins
		double mins = dec * 60;
		
		System.out.println(mins);

		System.out.printf(hours + " hours and " + (int)mins + " minutes");

	}
	
}


