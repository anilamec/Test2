package beginner;
import java.util.*;
import java.text.*;
public class TimeDifference {
	public static void main(String[] args) {
		try {
			long start =System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			
			Thread.sleep(560);
			System.out.println(new Date() + "\n");
			
			long end=System.currentTimeMillis();
			long diff= end-start;
			
			System.out.println("The difference is: " + diff);
		} catch (Exception e){
			System.out.println("Got an exception");
		}
			System.out.println(Runtime.getRuntime());
	}
}
