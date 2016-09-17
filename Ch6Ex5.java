import java.util.*;

public class Ch6Ex5 {

	public static void main(String[] args) {
		// get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
		
	}

	public static void displaySortedNumbers(double num1, double num2, double num3){
		double a = num1;
		double b = num2;
		double c = num3;
		if (a > b){
			if (b > c){
				System.out.println(c + " " + b + " " +  a);
			} // end if a > b > c
			else if (c > a){
				System.out.println(b + " " +  a + " " +  c);
			}
			else System.out.println(b + " " +  c + " " +  a); 		
		} // not done til gone through whole a>b part
		else if (a > c){
			System.out.println(c + " " +  a + " " +  b);
		}
		else if (c > b){
			System.out.println(a + " " + b + " " + c);
		}
		else System.out.println(a + " " +  c + " " +  b);
	} // end of method displaySortedNumbers
	
} // end of Ch6Ex5
