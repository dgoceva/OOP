
public class Student implements Comparable<Student>{
//{
	private int number;
	private String firstName;
	private String lastName;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Student(int number, String firstName, String lastName) {
		super();
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "(" + number + ", " + firstName + ", " + 
				lastName + ")";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.number-number;
	}
	
}
