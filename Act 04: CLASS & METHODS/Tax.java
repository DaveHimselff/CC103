public class Tax {
	double grossIncome; 	
	String state;
	int dependents;
	static int customerCounter;
	
	
	Tax (double gi, String st, int depen){
		grossIncome = gi; 	
		state = st;
		dependents = depen;
		customerCounter++;	
	
		System.out.println("Preparing the tax data for customer #" + customerCounter); }

		
		double euroCurruncy(double yourTaxeuro) {
			double euro = calcTax() / 1.25;
			return euro; }
					
			double calcTax(){
				return (grossIncome * 0.33 - dependents * 100);
		
	
			}
}