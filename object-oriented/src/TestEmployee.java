import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {


		/*Employee e1 = new Employee("Polo", 4000);
		e1.payslip();
		
		Employee e2 = new Employee("Max", 6000);
		e2.payslip();
		
		Manager m1 = new Manager("Mili", 5000, 2000);
		m1.payslip();
		System.out.println("Manager Salary: "+m1.getSalary());

		Executive x1 = new Executive("Jack", 3000, 1000);
		x1.payslip();
		System.out.println("Executive salary: "+x1.getSalary());*/
		
		Manager m1 = new Manager("Mili", 5000, 2000);
		showSalary(m1);
		
		Executive x1 = new Executive("Jack", 3000, 1000);
		showSalary(x1);
	}

	private static void showSalary(Executive x1) {
		System.out.println("Executive Salary: "+x1.getSalary());
		
	}

	private static void showSalary(Manager m1) {
		System.out.println("Manager Salary: "+m1.getSalary());
		
	}
	
	private static void showSalary(Employee e) {
		if(e instanceof Manager) {
			System.out.println("Manager Salary: "+e.getSalary());
		else
			System.out.println("Executive Salary: "+e.getSalary());	
		}
	}
	
	

}
