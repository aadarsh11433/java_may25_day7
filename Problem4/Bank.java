package com.Problem4;

public class Bank {

	 String branchName;
	 String IfscCode;
	

	 void displayDetails() {
		 
		 System.out.println("THE barnch name is : "+this.branchName);
		 System.out.println("The IFSC Code is : "+this.IfscCode );
		 
	 }


	public Bank(String branchName, String ifscCode) {
		super();
		this.branchName = branchName;
		IfscCode = ifscCode;
	}
	 
	 
	

}
