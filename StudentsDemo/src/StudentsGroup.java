import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

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
		for (int i = 0; i < group.length; i++) {
//			group[i] = Student.inputStudent();
			group[i] = new Student();
			group[i].inputStudentInfo();
//			group[i] = new Student(Student.inputStudent());
		}
	}

	public void inputStudentsFromFile(String fileName) {
		File in = new File(fileName);
		int i=0;
		try {
			Scanner sc = new Scanner(in);
			while(sc.hasNext()) {
				group[i] = new Student();
				group[i].inputStudentFromFile(sc);
// //				i=(i+1)%group.length;
//				i++;
//				if (i==group.length) {
//					break;
//				}
				i = (i==group.length-1) ? group.length-1 : ++i;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public double averageGroupMark() {
		double sum = 0;
		for (Student st : group) {
			sum += st.getAvMark();
		}
		return Math.round(sum / group.length * 100) / 100.;
	}

	@Override
	public String toString() {
		return Arrays.toString(group);
	}

}
