import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
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
	public static void readBytes() throws FileNotFoundException, IOException {
		String name = "src/resources/earthDay.png";
		
		try(InputStream is=new FileInputStream(name)){
			byte[] buffer = new byte[is.available()];
			is.read(buffer);
			
			int count=0;
			for(byte b:buffer) {
				if (count%15==0) {
					System.out.println();
				}
				System.out.printf("%02x ",b);
				count++;
			}
		}
		System.out.println();
	}
	public static void urlReading() throws IOException {
		String urlName = "https://bg.wikipedia.org/wiki/%D0%94%D0%B5%D0%BD_%D0%BD%D0%B0_%D0%97%D0%B5%D0%BC%D1%8F%D1%82%D0%B0";
		URL url = new URL(urlName);
		
		try(InputStream is = url.openStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is))){
			br.lines().forEach(System.out::println);
		}
	}
}
