import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStringStream {
	public static void main() {
		List<String> words = Arrays.asList("one","two","three","four");
		
		String text = words.stream().findFirst().get();
		System.out.println(text);
		
		Stream<String> chars = Arrays.stream(new String[] {"a","b","c"});
		System.out.println("Counts: "+chars.count());
		
		String day = "Monday";
		IntStream istream = day.codePoints();
		String s = istream.filter(e -> e!='n').collect(StringBuilder::new, 
				StringBuilder::appendCodePoint, 
				StringBuilder::append).toString();
		System.out.println(s);
		
		Stream<String> numbers = Stream.of("one","two","three","four","five");
		String number3 = numbers.skip(2).findFirst().get();
		System.out.println(number3);
		
		List<Student> students = Arrays.asList(new Student(12101,"Ivan Ivanov"),
				new Student(11103,"Petyr Petrov"),new Student(11201,"Lili Marinova"),
				new Student(12201,"Georgy Ivanov"),new Student(12104,"Ivan Petrov"));
		
		students.stream().sorted(Comparator.comparing(Student::getNumber).reversed())
			.forEach(System.out::println);

		students.stream().sorted(Comparator.comparing(Student::getName))
		.forEach(System.out::println);

	}
}
