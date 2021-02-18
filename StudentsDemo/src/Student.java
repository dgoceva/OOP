import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {
	private int number;
	private String name;
	private double avMark;

	public Student() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int number, String name, double avMark) {
//		super();
		this.number = number;
		this.name = name;
		this.avMark = avMark;
	}

	public Student(Student st) {
		this.number = st.number;
		this.name = st.name;
		avMark = st.avMark;
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

	public double getAvMark() {
		return avMark;
	}

	public void setAvMark(double avMark) {
		this.avMark = avMark;
	}

	@Override
	public String toString() {
		return "(" + number + ", " + name + ", " + avMark + ")";
	}

	public static Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		System.out.println("Number= ");
		st.setNumber(sc.nextInt());
		System.out.println("Name=");
		st.setName(sc.next());
		System.out.println("Average Mark=");
		st.setAvMark(sc.nextDouble());

		return st;
	}

	public Student inputStudentInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number= ");
		setNumber(sc.nextInt());
		System.out.println("Name=");
		setName(sc.next());
		System.out.println("Average Mark=");
		setAvMark(sc.nextDouble());

		return this;
	}

	public Student inputStudentFromFile(Scanner sc) {
		setNumber(sc.nextInt());
		setName(sc.next());
		setAvMark(sc.nextDouble());
		return this;
	}
}
