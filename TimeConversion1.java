import java.util.*;
import java.text.*;


public class TimeConversion1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a an hour in the 24-hour format: ");
		int timeInput = input.nextInt();
		if (timeInput < 0 || timeInput > 24){
			System.out.println("Invalid time");
			System.exit(0);
		}
		
		
		 GregorianCalendar someTime = new GregorianCalendar(); // == current local time
			int hours = someTime.get(Calendar.HOUR);
			int mins = someTime.get(Calendar.MINUTE);
			int secs = someTime.get(Calendar.SECOND);
			boolean pm = someTime.get(Calendar.AM_PM) == Calendar.PM;
			
			int myHours = convertedTime(timeInput);
			int amOrPM = convertAmPM(timeInput);
			String ampm = "";
			if (amOrPM == 1){
				ampm = "am";
			}
			else {
				ampm = "pm";
			}
			
			//System.out.printf("The 12-hour time is : %d%s%n", myHours, pm ? "pm" : "am");
			System.out.printf("The 12-hour time is : %d" + ampm, myHours);
			
		
	}
	public static int convertedTime(int time){
		int newTime = 0;
		if (time >= 1 && time <=12){
			return time;
		}
		else if (time == 00){
			newTime = 12;
			return newTime;
		}
		else {
			newTime = time - 12;
		return newTime;
		}
	}
	public static int convertAmPM(int time){
		int newTime = 0;
		if (time >= 00 && time <=11){
			return 1;
		}
		else if (time == 12){
			return 2;
		}
		else if (time == 24){
			return 1;
		}
		else {
			newTime = time - 12;
		return 2;
		}
	}
}


