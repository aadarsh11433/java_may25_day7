package com.Problem4;

import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bank) {
	
//		System.out.println("input is: " + bank);
		
		if(bank.equalsIgnoreCase("axis")) {
			
			AxisBank a  = new AxisBank(5.00,"Presonal Branch" , "Axis2000");
			
			return a;
		}
		
		else if(bank.equalsIgnoreCase("icici")) {
			
			ICICIBank a  = new ICICIBank(5.00,"Presonal Branch" , "Axis2000");
			return a;
		}
		
		else 
		return null;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter bank name ");
		Scanner sc  = new Scanner(System.in);
		
		String input  = sc.next();
		
		Bank  returnedBank = getBank(input);
		
		
		if(returnedBank instanceof AxisBank) {
			
			returnedBank.displayDetails();
			((AxisBank) returnedBank).getCreditCard();
			
		}
		else if(returnedBank instanceof ICICIBank) {
			
			returnedBank.displayDetails();
			
			
		}
		else {
			
			System.out.println("Passed bank name is invalid");
		}
		
		
		
	}
	
}
