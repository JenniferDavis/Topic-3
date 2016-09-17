import java.util.*;

public class Ch6Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// get input
		System.out.print("Enter the investment amount: $");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble() / 100;
		
		double monthlyInterestRate = annualInterestRate / 12;
		int years = 5;
		
		double futureInvestmentValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
		
		System.out.println("The amount invested: " + investmentAmount);
		System.out.println("Annual interest rate: " + annualInterestRate);
		System.out.println("Years Future Value");
		
		int year = 1;
		double newInvestmentAmount = 0;
		while (year <= 30){
			double futureInvestmentAmount = futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
			System.out.printf(year + " %1.2f\n", futureInvestmentAmount );
			year++;
		}
		
		
		
	}

	// futureInvestmentValue method
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
		return futureInvestmentValue;
	}// end futureInvestmentValue method
	
}//main end





//For example, if you enter amount 1000, annual interest rate 3.25%, and number
//of years 1, the future investment value is 1032.98.