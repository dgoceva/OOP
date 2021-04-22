import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
	public static void outputBytes() throws FileNotFoundException, IOException {
		String outName="src/resources/myfile4.txt";
		String name="src/resources/myfile3.txt";
		String line;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
				FileOutputStream os = new FileOutputStream(outName)){
			
			while ((line=br.readLine())!=null) {
				byte[] outBytes = line.getBytes();
				os.write(outBytes);
			}		
		}
	}
	public static void appendToFile() throws FileNotFoundException, IOException {
		String outName="src/resources/myfile4.txt";
		String name="src/resources/myfile3.txt";
		String line;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
				FileOutputStream os = new FileOutputStream(outName,true)){
			
			while ((line=br.readLine())!=null) {
				byte[] outBytes = line.getBytes();
				os.write(outBytes);
			}		
		}
	}
	public static void outputEncoding() throws FileNotFoundException, IOException {
		String outName="src/resources/myfile4.txt";
		String name="src/resources/myfile3.txt";
		String line;
		String text = "Lorem Ipsum е елементарен примерен текст, използван в печатарската и типографската индустрия. Lorem Ipsum е индустриален стандарт от около 1500 година, когато неизвестен печатар взема няколко печатарски букви и ги разбърква, за да напечата с тях книга с примерни шрифтове. Този начин не само е оцелял повече от 5 века, но е навлязъл и в публикуването на електронни издания като е запазен почти без промяна. Популяризиран е през 60те години на 20ти век със издаването на Letraset листи, съдържащи Lorem Ipsum пасажи, популярен е и в наши дни във софтуер за печатни издания като Aldus PageMaker, който включва различни версии на Lorem Ipsum.";
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
				OutputStreamWriter os = new OutputStreamWriter(
						new FileOutputStream(outName,true),StandardCharsets.UTF_8)){
			
			while ((line=br.readLine())!=null) {
				os.write(line);
			}
			os.write(text);
		}
	}
}
