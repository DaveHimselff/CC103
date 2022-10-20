    package com.practicaljava.LESSON_6;

	public class ForeignContractor extends Person {

	public ForeignContractor (String name) {
	super (name);	
	}
	
	public boolean increacsePay(int percent) {
		System.out.println("I'm just a Foreign Worker");
		return true;
		
	}
}