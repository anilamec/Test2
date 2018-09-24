package beginner;

public class ValueExchange {
	
	public static void main(String[] args) {
		int a=30;
		int b=10;
		System.out.println("The valve of a befor exchange: " + a);
		System.out.println("The valve of b befor exchange: " + b);
		
		int c=a;
			a=b;
			b=c;
		System.out.println("The valve of a after exchange: " + a);
		System.out.println("The valve of b after exchange: " + b);				
	}
}
