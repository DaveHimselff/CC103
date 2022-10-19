public class Tax 
{
	double grossIncome;
    String state;
    int dependents;
	static int customerCounter;

	// Constructor
	Tax (double gi, String st, int depen)
	{
		grossIncome = gi; 	// member variable initialization
		state = st;
		dependents = depen;
		customerCounter++;	// increment the counter by one
	
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
   
	double adjustedForStudents (double stateTax) 
	{
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}

	double euroCurruncy(double yourTaxeuro) 
	{
		double euro = calcTax() / 1.25;
		return euro;
	}
	
    public double calcTax() 
    {
		double stateTax = 0;
		if (grossIncome < 30000) 
		{
			stateTax = grossIncome * 0.05;
		}
		else 
		{
			stateTax = grossIncome * 0.06;
		}
		
		return stateTax;
    }
}
