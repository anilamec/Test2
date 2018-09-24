package beginner;

public class AbstractDemo extends Salary{
	public static void main(String [] args) {
	      
		Nurse n1= new Nurse("Hari","No Address",5);
		Nurse n=new Salary("Ram","His Address",4,55000.00);	
		
		//System.out.println(s.computePay());
		
		System.out.println("Call mailCheck using Salary reference --");
	    
	    System.out.println("\nCall mailCheck using Employee reference--");
	    
	    n.mailCheck();
	    
	    //n1.mailCheck();
	    
	    ((Salary) n).computePay();//downcasting
	   }
}
