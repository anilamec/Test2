package beginner;
import java.io.*;
import java.util.*;
public class CopyFile {
	
	public static void main (String args[]) throws IOException {
		File file = new File("C:\\Users\\Jiwan\\eclipse-workspace\\Beginers\\input.txt");
		FileReader in =null;
		FileWriter out =null;
		
		try {
			in =new FileReader("input.txt");
			out = new FileWriter("output.txt");
			int c;
			while ((c=in.read()) !=-1) {
				out.write(c);
			}
		} finally {
			if (in !=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
		}
	}
}

