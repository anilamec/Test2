package beginner;
public class InheritanceExample extends Calculation {

	public int mult(int x, int y) {
		z=x*y;
		return z;
	}
	
	public static void main(String[] args) {
		int a=20,b=10;
		InheritanceExample demo = new InheritanceExample();
				
		int sum = demo.add(a, b);
		int diff = demo.sub(a, b);
		int prod = demo.mult(a, b);
		
		System.out.println("The addition is: " +sum);
		System.out.println("The Substraction is: " +diff);
		System.out.println("The Multiplication is: " +prod);
		
	}

}

class Calculation{
	int z;
	
	public int add(int x, int y) {
		z=x+y;
		return z;
	}
	
	public int sub(int x, int y) {
		z=x-y;
		return z;
	}
}
