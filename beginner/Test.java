package beginner;

public class Test {

	public static void main(String []args) {
		Integer a;
		String b;
		a=10;
		b= (a==1)?"This is the true value":"This is the false value";
		// assign the value of b: b==20 if a==1, b==30 if a!=1
		// Since a!=1 the value of b should be 30;
		
		System.out.println("The value of a is: "+a);
		
		boolean result = a instanceof Integer;
	}
}
