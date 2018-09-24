package beginner;
import java.io.*;
import java.util.*;
public class ReadConsole {

	public static void main(String[] args) throws IOException{
		InputStreamReader cin =null;
		FileOutputStream out=null;		
		try {
			cin= new InputStreamReader(System.in);
			out =new FileOutputStream("output.txt");
			
			System.out.println("Enter characters, 'q' to quite.");
			char c;
			
			do{
				c=(char) cin.read();
				out.write(c);
			}while (c!='q');
			
		}finally {
			if (cin!=null) {
				cin.close();
			}
			if(out !=null) {
				out.close();
			}
		}
	}
}
