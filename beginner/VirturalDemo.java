package beginner;
public class VirturalDemo {

	public static void main(String[] args) {		
		Salary s = new Salary("Sampad Neupane","4229 Yucca Dr. Irving TX-75038", 3,54000.00);		
		Employees e=new Employees("Anil Lamichhane","1648 Secretariate Ln Irving TX-75060",36000);
		
		System.out.println("Call mailCheck using Salary reference--");
		s.mailCheck();
		
		System.out.println("\nCall mailCheck using employee reference--");
		e.mailCheck();
		
		//s.payEmployee(e);
	}
}
