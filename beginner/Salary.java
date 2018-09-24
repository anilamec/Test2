package beginner;
public class Salary extends Nurse{
	private double salary; //annual salary
	
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	
	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public void mailCheck() {
		System.out.println("Within mailCheck of salary class ");
		System.out.println("Mailing check to " + getName()+" with salary "+salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
		public void setSalary(double newSalary) {
		if (newSalary>=0.0) {
			salary=newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("Computing salary pay for " +getName());
		return salary/52;
	}
	
	/*public void payEmployee(Employees e) {
		e.mailCheck();
	}*/
	
}
