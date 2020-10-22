import java.util.Arrays;

public class StudentsGroup {
	private Student[] group;

	public StudentsGroup(Student[] group) {
//		super();
		this.group = group;
	}

	public StudentsGroup() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public StudentsGroup(int count) {
		group = new Student[count];
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}
	
	public void inputStudents() {
		for(int i=0;i<group.length;i++) {
//			group[i] = Student.inputStudent();
			group[i] = new Student();
			group[i].inputStudentInfo();
//			group[i] = new Student(Student.inputStudent());
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(group);
	}
	
}
