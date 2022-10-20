package com.practicaljava.lesson7B;

	public class TestPayIncreaseInterface {
		
		public static void main(String[] args) {
	
			payable workers[] = new payable[3];
			workers[0] = new Employee("John");
			workers[1] = new Contractor("Mary");
			workers[2] = new Employee("Steve");
		
		for (payable p: workers) {
			((payable)p).increasePay(30);
		}
	}
}
