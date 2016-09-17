import java.util.Scanner;

public class Ch4Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// call on Scanner to read variable input
		Scanner input = new Scanner(System.in);

//get first coordinates input 
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		
// read string input and replace commas with whitespaces
		String lat_x1 = input.next().replaceAll(",", " ");
		String lat_y1 = input.next().replaceAll(",", " ");
		
/* check for correct output
		System.out.println(lat_x1);
		System.out.println(lat_y1);
*/	
		
// get second coordinates input
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");

// read string input and replace commas with whitespaces
		String lon_x2 = input.next().replaceAll(",", " ");
		String lon_y2 = input.next().replaceAll(",", " ");

/* check for correct output
		System.out.println(lon_x2);
		System.out.println(lon_y2);
*/	
		
// convert strings to double
		double latitude_x1 = Double.parseDouble(lat_x1);
		double latitude_y1 = Double.parseDouble(lat_y1);
		double longitude_x2 = Double.parseDouble(lon_x2);
		double longitude_y2 = Double.parseDouble(lon_y2);
		
/* check for correct output
		System.out.println(latitude_x1);
		System.out.println(latitude_y1);
		System.out.println(longitude_x2);
		System.out.println(longitude_y2);	
*/			

		
		
		//declare variables
			final double EARTH_RADIUS = 6371.01;  // in km
				
//compute
		
		
		// compute distance between 2 geographical points
		double distance = EARTH_RADIUS * Math.acos( Math.sin(Math.toRadians(latitude_x1)) * Math.sin(Math.toRadians(longitude_x2)) + Math.cos(Math.toRadians(latitude_x1)) * Math.cos(Math.toRadians(longitude_x2)) * Math.cos(Math.toRadians(latitude_y1) - Math.toRadians(longitude_y2) ) );
			
	
		
//display
		System.out.println("The distance between the two points is " + distance + " km.");
			
		
	}

}
