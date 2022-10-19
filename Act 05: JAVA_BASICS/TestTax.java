  
public class TestTax 
{
		public static void main(String[] args) 
		{
		double euro; // local variable
		
		if (args.length != 3){
			System.out.println("Sample usage of the program: java TestTax 50000 NJ 2");
			System.exit(0);
		 }
	        

		double grossIncome = Double.parseDouble(args[0]); //local variables
		String state = args[1];
		int dependents = Integer.parseInt(args[2]);
		

		// first instance for the first customer
		Tax t = new Tax(grossIncome, state, dependents); 
        
		double yourTax = t.calcTax(); //calculating tax 
                    
		// Printing the result in dollars 
		System.out.println("Your tax is " + yourTax);	
    
	
		// second instance for the second customer
		Tax t2 = new Tax(65000, "TX", 4); 
    
		double hisTax = t2.calcTax(); //calculating tax 

		// Printing the result in dollars
		System.out.println("His tax is " + hisTax);
		
		// Printing the result in euros
        System.out.println();
        euro = t.euroCurruncy(yourTax);
        System.out.println("Your tax in euros is " + euro);
        euro = t2.euroCurruncy(yourTax);
        System.out.println("His tax in euros is " + euro);
	}
}
