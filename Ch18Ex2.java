import java.util.*;

public class Ch18Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index: ");
		int index = input.nextInt();
		
		System.out.println("The Fibonacci number at index " + index + " is " + currentFib(index));
	} // end main
	
	public static int currentFib(int index){
		int currentFib = 0;
		int f0 = 0; // For fib(0)
		int f1 = 1; // For fib(1)
		int n = index;
		
		for (int i = 1; i <= n; i++) {
		currentFib = f0 + f1;
		f0 = f1;
		f1 = currentFib;
		}
		// After the loop, currentFib is fib(n)
		return currentFib;
	}

}
