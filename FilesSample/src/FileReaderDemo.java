import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderDemo {
	public static void main() throws IOException {
		var fname = "src/resources/myfile.txt";
		char[] buffer = new char[1024];
		
		try(var fr = new FileReader(fname,StandardCharsets.UTF_8)) {
			while(fr.read(buffer)!=-1) {
				System.out.println(buffer);
			}
		}
	}
	public static void readBuffer() throws FileNotFoundException, IOException {
		var fname = "src/resources/myfile.txt";

		try(var br = new BufferedReader(new FileReader(fname))){
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}
	}
}
