
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student(123,"Ivan",5.56);
		System.out.println(st);
		
		Student st1 = new Student(123,"Ivan",5.56);
		System.out.println(st1);
		
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
	}

}
