
public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee("John", "Smith", 101, 35);

	
			
			  System.out.println("Employee Pay of 40 hours: $" + employee.computePay(40));
			  System.out.println("Employee Pay of 23 hours: $" + employee.computePay(23));
			  System.out.println("Employee Pay of 1 hours: $" + employee.computePay(1));
			  System.out.println("Employee Pay of 0 hours: $" + employee.computePay(0));
			  System.out.println("Employee Pay of -5 hours: " + employee.computePay(-5));
			  System.out.println("Employee Pay of 45 hours: " + employee.computePay(45)); }
	}

