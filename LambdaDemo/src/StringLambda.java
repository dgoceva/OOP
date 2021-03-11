import java.util.ArrayList;
import java.util.Comparator;
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
		
//		items.forEach(text->{System.out.println(text);});
		
//		for(String text : items) {
//			System.out.println(text);
//		}
		
//		items.stream().filter(item->(item.length()==5)).forEach(System.out::println);
		
		items.sort(Comparator.naturalOrder());
		items.forEach(System.out::println);
		
		items.sort(Comparator.reverseOrder());
		items.forEach(System.out::println);
	}
}
