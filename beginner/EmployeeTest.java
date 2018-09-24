package beginner;
import java.io.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee empOne=new Employee("James Smith");
		Employee empTwo=new Employee("Mary Anne");
		
		//Invoking methods from each object created
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(20);
		empTwo.empDesignation("Senior Electrical Engineer");
		empTwo.empSalary(5000);
		empTwo.printEmployee();
	}

}
