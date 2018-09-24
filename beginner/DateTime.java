package beginner;
import java.text.*;
import java.util.*;
public class DateTime {

	public static void main(String[] args) {
		//Instantiate a Date object
		Date date =new Date();
		SimpleDateFormat ft= new SimpleDateFormat("MM.dd.yyyy");
		String input = args.length==0? "11.15.2018": args[0];
		
		System.out.print(input+" Parses as ");
		Date t;
		try {
			t=ft.parse(input);
					System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " +ft);
		}
		
		/* Display time and date using toString()
		System.out.println(ft.format(date));
		System.out.printf("%1$s %2$tB %2$td, %2$ty", "Due Date:", date);*/
	}

}
