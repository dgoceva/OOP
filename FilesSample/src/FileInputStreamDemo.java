import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileInputStreamDemo {
	public static void readChars() throws FileNotFoundException, IOException {
		String name="src/resources/myfile3.txt";
		char c;
		
		try (FileInputStream is = new FileInputStream(name)){
			while((c=(char)is.read())!=-1) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void readText() throws FileNotFoundException, IOException {
		String name="src/resources/myfile3.txt";
		byte[] buffer = new byte[1024];
		
		try(FileInputStream is = new FileInputStream(name)) {
			while (is.read(buffer)!=-1) {
				System.out.println(new String(buffer, StandardCharsets.UTF_8));
			}
		}
	}
	public static void readLines() throws FileNotFoundException, IOException {
		String name="src/resources/myfile3.txt";
		String line;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(name)))) {
			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}
	}
}
