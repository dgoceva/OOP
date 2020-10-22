
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
		return "Student [number=" + number + ", name=" + name + ", avMark=" + avMark + "]";
	}
	
	
}
