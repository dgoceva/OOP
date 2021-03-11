import java.util.HashSet;
import java.util.Set;

public class SetLambda {
	public static void set() {
		Set<String> data = new HashSet<>();
		
		data.add("one");
		data.add("two");
		data.add("three");
		
		data.forEach(e->{System.out.println(e);});
	}
}
