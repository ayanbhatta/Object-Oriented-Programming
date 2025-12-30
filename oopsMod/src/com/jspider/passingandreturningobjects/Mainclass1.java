package com.jspider.passingandreturningobjects;

public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=Hr.createEmployee();
		Hr.displayEmployeeDetails(e);
		System.out.println("--------------------");
		Employee e2 = Hr.createEmployee();
		Hr.displayEmployeeDetails(e2); 
	}

}
