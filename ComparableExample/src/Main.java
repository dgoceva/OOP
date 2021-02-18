import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> group = Arrays.asList(
			new Student(123,"A","B"),
			new Student(111,"A","A"),
			new Student(121,"B","B")
		);
		System.out.println(group);
		Collections.sort(group);
		System.out.println(group);
		
		List<Integer> data = Arrays.asList(1,2,3,-4,-6,3);
		System.out.println(data);
		Collections.sort(data);
		System.out.println(data);
	}

}
