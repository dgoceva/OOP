import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class InputObjectStreamDemo {
	public static void main() throws FileNotFoundException, IOException, ClassNotFoundException {
		String name="src/resources/myfile.dat";
		
		try(ObjectInputStream is=new ObjectInputStream(new FileInputStream(name))){
			List<Country> countries = (List<Country>) is.readObject();
			countries.forEach(System.out::println);
		}
	}
}
