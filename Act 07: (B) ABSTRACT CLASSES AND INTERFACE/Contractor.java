package com.practicaljava.lesson7B;

public class Contractor implements payable {

	private String name;
	public Contractor(String name) {
		this.name = name;
	}
	
	public boolean increasePay(int percent) {
		if(percent < payable.INCREASE_CAP) {
			System.out.println( "Increasing salary by " + percent + " %. " + name);
		return true;
		
		} else {
			System.out.println("Sorry, can't increase hourly rate by more than " +payable.INCREASE_CAP + "%. " + name);
			return false;
		}
		
	}
}