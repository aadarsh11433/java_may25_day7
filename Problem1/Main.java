package com.Problem1;

public class Main {

	public static void main(String[] args) {
		
		
		Manager m1ob = new Manager();
		
		Employee e1ob  =new Employee();
		
		m1ob.Address ="X colony Street 04";
		m1ob.Age = 45;
		m1ob.Phonenumber ="1234567890";
		m1ob.Name ="Ramesh";
		m1ob.Salary = 40000.00;
		m1ob.Department = "HR";
		m1ob.Specialisation = "Hiring";
		
		
		e1ob.Address ="ABC colony Street 06";
		e1ob.Age = 40;
		e1ob.Phonenumber ="7894561230";
		e1ob.Name ="Rakesh";
		e1ob.Salary = 35000.00;
		e1ob.Department = "Marketing";
		e1ob.Specialisation = "Digital Marketing";
		
		
		/// printing object details of member class
		
		System.out.println(m1ob.Name);		
		System.out.println(m1ob.Address);
		System.out.println(m1ob.Age);
		System.out.println(m1ob.Phonenumber);
		System.out.println(m1ob.Department);
		System.out.println(m1ob.Specialisation);
		m1ob.printSalary();
		
		
		System.out.println("=======================");
		
		/// printing object details of Employee  class
		
				System.out.println(e1ob.Name);		
				System.out.println(e1ob.Address);
				System.out.println(e1ob.Age);
				System.out.println(e1ob.Phonenumber);
				System.out.println(e1ob.Department);
				System.out.println(e1ob.Specialisation);
				e1ob.printSalary();
		
		
		
		
		

	}

}
