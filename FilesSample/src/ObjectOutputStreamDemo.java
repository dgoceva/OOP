import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamDemo {
	public static void main() throws FileNotFoundException, IOException {
		String name="src/resources/myfile.dat";
		
		try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(name))){
			List<Country> countries = new ArrayList<>();
			countries.add(new Country("Slovakia",5429000));
			countries.add(new Country("Norway",5271000));
			countries.add(new Country("Croatia",4225000));
			countries.add(new Country("Bulgaria",7000000));
			
			os.writeObject(countries);
		}
	}
}
