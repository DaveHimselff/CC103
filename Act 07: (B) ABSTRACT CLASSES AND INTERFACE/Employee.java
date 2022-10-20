package com.practicaljava.lesson7B;

public class Employee implements payable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public boolean increasePay(int percent) {
		System.out.println( "Increasing salary by " + percent + " %. " + name);
		return true;
	}

}