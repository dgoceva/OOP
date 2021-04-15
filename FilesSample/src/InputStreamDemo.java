import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class InputStreamDemo {
	public static void inputStreamText() throws FileNotFoundException, IOException {
		String fname = "src/resources/myfile3.txt";
		
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(fname),StandardCharsets.UTF_8))){
			br.lines().forEach(line->System.out.println(line));
		}
		
		try(InputStream is = new FileInputStream(fname);
				InputStreamReader isr = new InputStreamReader(is,StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(isr)){
			br.lines().forEach(line->System.out.println(line));
		}
		
		InputStream is = new FileInputStream(fname);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		br.lines().forEach(line->System.out.println(line));
		br.close();
		isr.close();
		is.close();
	}
}
