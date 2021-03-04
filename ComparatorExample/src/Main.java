import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> group = Arrays.asList(
				new Student(123,"A","b"),
				new Student(111,"A","A"),
				new Student(121,"B","B")
				);
		System.out.println(group);
		Collections.sort(group,new FirstNameComparator());
		System.out.println(group);
		Collections.sort(group,new LastNameComparator());
		System.out.println(group);
		Collections.sort(group,new FirstNameComparator()
				.thenComparing(new LastNameComparator())
				);
		System.out.println(group);
	}

}
