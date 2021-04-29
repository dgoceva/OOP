import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main() throws FileNotFoundException, IOException {
		var namein="src/resources/myfile.txt";
		var nameout="src/resources/myfile5.txt";
		
		try(var br=new BufferedReader(new FileReader(namein));
				var bw=new BufferedWriter(new FileWriter(nameout))){
			String line;
			while((line=br.readLine())!=null) {
				bw.append(line);
				bw.append(System.lineSeparator());
			}
		}
	}
}
