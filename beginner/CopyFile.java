package beginner;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String args[]) throws IOException {
		File file = new File("C:\\Users\\Jiwan\\eclipse-workspace\\Beginers\\input.txt");
		FileReader in = null;
		FileWriter out = null;
		// This is test.
		try {
			in = new FileReader("input.txt");
			out = new FileWriter("output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
				// this is good
			}
		}
	}
}
