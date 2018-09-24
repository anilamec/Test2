package beginner;
public class EnhancedLoop {
	

	public static void main(String[] args) {
		
	Integer d=5;
	double e=6.60;
		Integer a=5;
		int [] serial = {10, 20, 30, 40, 50};
		
		for(int x: serial) {
			System.out.print(x+",");
		}
			
		System.out.print("\n");
		
		String [] names= {"Hari","Ram","Shyam","Damu","Dipak"};
		
		for (String x:names) {
			System.out.print(x+",");
		}
		
		System.out.println(a.byteValue());
		System.out.println(a.floatValue());
		System.out.println(a.doubleValue());
		
		if(d.equals(e)) {
			System.out.println("d and e are equal");			
		}
		
		else {
			System.out.println("d and e are not equal value "+ " "+ Integer.valueOf(d));
		}
		
		int b= Integer.parseInt("444",8);
		
		System.out.println("The min value is: " +Math.min(12,13));
		
		System.out.printf("This is printing the powere of %.3f ", Math.pow(4, 2));	
		
		System.out.println("\nMy name is Jiwan ".concat("Ghimire"));
	}
}
