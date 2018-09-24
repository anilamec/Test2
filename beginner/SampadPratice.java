package beginner;

public class SampadPratice {

	public static void main(String []args) {
		double []a= {20,30,10,15,6,500,8};
		double lMin= arrayMin(a);
		double lMax= arrayMax(a);
		double lSum= arraySum(a);
		
		System.out.println("The min value calculated is: " +lMin);
		System.out.println("The max value calculated is: " +lMax);
		System.out.println("The sum: "+lSum);
		}
	
		// Method to return max
		private static double arrayMax(double [] minArray) {
		double max=minArray[0];
		for(int i=1;i<minArray.length;i++)
		 {			
			if (max<minArray[i]) {
				max=minArray[i];
			}
		 }
		return max;
		}
		
		// Method to return min
		private static double arrayMin(double [] maxArray) {
			double min=maxArray[0];
			for(int i=1;i<maxArray.length;i++)
			 {				
				if (min>maxArray[i]) {
					min=maxArray[i];
				}
			 }
			return min;	
		}
			
		// Method to return sum
		private static double arraySum(double []sumArray) {
			double sum=0;
			for(int i=0;i<sumArray.length;i++) {
				sum+=sumArray[i];				
			}
			return sum;
		}
}