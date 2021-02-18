import java.util.Comparator;

public class Student {
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
		return "(" + number + ", " + firstName + 
				", " + lastName + ")";
	}
}

class FirstNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getFirstName().compareTo(arg1.getFirstName());
	}
}

class LastNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			return s1.getLastName().compareToIgnoreCase(
					s2.getLastName());
		}
		return 0;
	}
	
}