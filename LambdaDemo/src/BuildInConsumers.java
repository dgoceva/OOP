import java.util.Arrays;
import java.util.Collections;
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
		Student s1 = new Student(17304, "Ivan Ivanov", 5.45);
		Student s2 = new Student(17301, "Petyr Petrov", 5.45);
		Student s3 = new Student(17302, "Lili Marinova", 4.43);
		Student s4 = new Student(17303, "Georgi Georgiev", 4.05);
		
		List<Student> data = Arrays.asList(s1,s2,s3,s4);
		
		data.sort(Comparator.comparingInt(Student::getNumber));
		data.forEach(System.out::println);
		System.out.println();
		data.sort(Comparator.comparingDouble(Student::getMark));
		data.forEach(System.out::println);
		System.out.println();
		data.sort((e1,e2)->(e1.getMark()>e2.getMark())?-1:
			((e1.getMark()<e2.getMark())?1:0));
		data.forEach(System.out::println);
		System.out.println();
		data.sort(new CompareByMark());
		data.forEach(System.out::println);
		System.out.println();
		data.sort(Comparator.comparingDouble(Student::getMark)
				.thenComparing(Student::getNumber));
		data.forEach(System.out::println);
		System.out.println();
		Collections.sort(data);
		data.forEach(System.out::println);
		System.out.println();		
	}
}

class Student implements Comparable<Student>{
	private int number;
	private String name;
	private double mark;
	
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
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
	public Student(int number, String name, double mark) {
		super();
		this.number = number;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student {number=" + number + ", name=" + name + ", mark=" + mark +"}";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return Comparator.comparingDouble(Student::getMark)
				.thenComparing(Student::getName)
				.compare(this,o);
	}
}

class CompareByMark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getMark()>o2.getMark())
			return -1;
		else if (o1.getMark()<o2.getMark())
			return 1;
		return 0;
	}
	
}