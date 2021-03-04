import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StringLambda {
	public static void string() {
		List<String> items = new ArrayList<>();
		
		items.add("one");
		items.add("two");
		items.add("three");
		items.add("four");
		items.add("five");
		
		items.forEach(text->{System.out.println(text);});
		
//		for(String text : items) {
//			System.out.println(text);
//		}
	}
}
