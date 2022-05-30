package com.Problem4;

public class AxisBank extends Bank {

	double rateOfInterest;
	
	void displayDetails() {
		
		System.out.println("Branc name is: "+this.branchName);
		System.out.println("Branc ifsc code is: "+this.IfscCode);
		System.out.println("Interest Rate is: "+this.rateOfInterest);
	}
	
	 void getCreditCard() {
		 System.out.println("Get the Credit Card from the Axis bank");
	 }

	public AxisBank(double rateOfInterest,String bankname,String IFSC) {
		super(bankname , IFSC);
		this.rateOfInterest = rateOfInterest;
	}
	
	 
	 
}
