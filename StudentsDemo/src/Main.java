
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsGroup gr = new StudentsGroup(3);
//		gr.inputStudents();
		gr.inputStudentsFromFile("D:\\UKTC\\OOP\\StudentsDemo\\src\\students.info");
		System.out.println(gr);
		System.out.println("Average Group Mark is: "+gr.averageGroupMark());
	}

}
