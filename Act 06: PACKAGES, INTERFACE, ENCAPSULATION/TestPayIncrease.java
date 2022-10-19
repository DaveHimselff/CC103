import com.practicaljava.LESSON_6.*;

public class TestPayIncrease {

	public static void main(String[] args) {
	Person workers[] = new Person[3];
	workers[0] = new Employee("John");
	workers[1] = new Contractor("mary");
	workers[2] = new Employee("Steve");
	
	Employee currentEmployee;
	Contractor currentContractor;
	
	for (Person p: workers){
		if (p instanceof Employee) {
			currentEmployee = (Employee)p;
			currentEmployee.increasePay(30);
			
		}else if (p instanceof Contractor) {
			currentContractor = (Contractor)p;
			currentContractor.increasePay(30);
		}
	}
	}

}
