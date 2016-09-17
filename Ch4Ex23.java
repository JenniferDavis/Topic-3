import java.util.*;

public class Ch4Ex23 {

	public static void main(String[] args) {
		// Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = input.next();
		
		System.out.println("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		double fedTaxRate = input.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		//set variables
		double grossPay = hoursWorked * payRate;
		double fedWithholding = grossPay * fedTaxRate;
		double stateWithholding = grossPay * stateTaxRate;
		double totalDeduction = fedWithholding + stateWithholding;
		double netPay = grossPay - (fedWithholding + stateWithholding);

		
		//Display
		System.out.println("Employee Name: " + name);
		
		System.out.println("Hours Worked: " + hoursWorked);
		
		System.out.println("Pay Rate: $" + payRate);
		
		System.out.printf("Gross Pay: $%1.2f\n", grossPay);
		
		System.out.println("Deductions:");
		
		System.out.printf("Federal Withholding (" + (fedTaxRate * 100) + "%%): $%1.2f\n", fedWithholding);
		
		System.out.printf("State Withholding (" + (stateTaxRate * 100) + "%%): $%1.2f\n", stateWithholding);

		System.out.printf("Total Deduction: $%1.2f\n", totalDeduction);

		System.out.printf("Net Pay: $%1.2f\n", netPay);
		
		
	}

}
