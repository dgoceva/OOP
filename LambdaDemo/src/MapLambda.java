import java.util.HashMap;
import java.util.Map;

public class MapLambda {
	public static void map() {
		Map<Integer,String> data = new HashMap<>();
		
		data.put(1, "one");
		data.put(2, "two");
		data.put(3, "three");
		data.put(4, "four");
		data.put(5, "five");
		
		data.forEach((k,v) -> {System.out.printf("%d: %s%n",k,v);});
	}
}
