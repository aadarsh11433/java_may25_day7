package com.Problem4;

public class ICICIBank extends Bank{

	double rateOfInterest;
	
	       @Override          //not mandatory but suggested to use 
	       
       void displayDetails() {
		
	    		System.out.println("Branc name is: "+this.branchName);
	    		System.out.println("Branc ifsc code is: "+this.IfscCode);
	    		System.out.println("Interest Rate is: "+this.rateOfInterest);
	    		
	 }
	       
	       public ICICIBank (double rateOfInterest,String bankname,String IFSC) {
	   		super(bankname , IFSC);
	   		this.rateOfInterest = rateOfInterest;
	   	}
}
