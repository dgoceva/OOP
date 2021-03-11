import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class BuildInConsumers {
	public static void cons() {
		int[] inumbs = {3,4,5,6};
		long[] lnumbs = {13L,14L,15L};
		double[] dnumbs = {2.4d, 9d, 10.5d, 7.4d, 6d};
		
		IntConsumer icons = i->System.out.print(i+" ");
		LongConsumer lcons = l->System.out.print(l+" ");
		DoubleConsumer dcons = d->System.out.print(d+" ");
		
		Arrays.stream(inumbs).forEach(icons);
		System.out.println();
		Arrays.stream(lnumbs).forEach(lcons);
		System.out.println();
		Arrays.stream(dnumbs).forEach(dcons);
		System.out.println();
	}
	
	public static void intCons() {
		Student s1 = new Student(17304, "Ivan Ivanov");
		Student s2 = new Student(17301, "Petyr Petrov");
		Student s3 = new Student(17302, "Lili Marinova");
		Student s4 = new Student(17303, "Georgi Georgiev");
		
		List<Student> data = Arrays.asList(s1,s2,s3,s4);
		
		data.sort(Comparator.comparingInt(Student::getNumber));
		data.forEach(System.out::println);
	}
}

class Student {
	private int number;
	private String name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student {number=" + number + ", name=" + name + "}";
	}
	
}
