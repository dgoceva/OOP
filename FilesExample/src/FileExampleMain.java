import java.util.Scanner;

public class FileExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileClass fc = new FileClass("D:\\UKTC\\FilesExample\\Problem.txt");
		System.out.println(fc);
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		System.out.print("y=");
		int y = sc.nextInt();
		fc.exchangeRows(x, y);
		System.out.println(fc);
		fc.writeToFile("Problem.out.txt");
	}

}
