

import java.util.Scanner;
import java.util.regex.*;
import java.util.*;



public class Ch6Ex18 {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password that includes:\nat least 8 characters, \nonly letters and digits, \nand must contain at least two digits");
		String password = input.next();
		
		checkPassword(password);
	} //end main

	
	
	

	
	public static void checkPassword(String password){
		String pw = password;		
		
						
			
		int num=0;
		char[] z ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};		
		
		
		boolean test=false;
		char[] t = pw.toLowerCase().toCharArray();
		for(int i = 0;i<t.length;i++)
		{
			
			char x = t[i];
			
			if(Character.isDigit(x))
			{test = false;
			if(testparse(x))
			{
				num++;
			}
			continue;}
			else{
				test = true;
			}
			
			
		}
		
// second test: has both letters and numbers only?

		

			if(test||num<2||num>=pw.length()||pw.length()<8){
			System.out.println("Invalid Password");
			System.exit(0);
		}
		
		else {
			System.out.println("Valid Password");
		}	

	}



	static boolean testparse(char x) {  
	     try {  
	         Integer.parseInt(stringparse(x));  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	static String stringparse(char x) {  
	     try {  
	       String z = String.valueOf(x);
	         return z;  
	      } catch (NumberFormatException e) {  
	         return null;  
	      }  
	}
	
	} // end checkpassword
//} // end main




