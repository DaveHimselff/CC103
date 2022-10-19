package com.practicaljava.LESSON_6;

public class Contractor extends Person implements payable {

	public Contractor(String name) {
		super(name);
	}
	
	public boolean increasePay(int percent) {
		if(percent < payable.INCREASE_CAP) {
		System.out.println( "Increasing salary by " + percent + " %. " + getName());
		return true;
		
		} else {
			System.out.println("Sorry, can't increase hourly rate by more than " +payable.INCREASE_CAP + "%. " + getName());
			return false;
		}
		
	}
}
