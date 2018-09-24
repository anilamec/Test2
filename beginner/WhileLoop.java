package beginner;

public class WhileLoop {
		
	public static void main(String[] args) {
		int b=1;
		double []c= {1,5,6,13,-18,199};
		
		double min = c[0];
	while (b<c.length) {
		if (min>c[b]) {
			min=c[b];
		}
		b++;
	}
	System.out.println("Min is " + min +"\n");
}

}
